/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.mediator.GUI;

import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author 984571
 */
public class ReversiSquare extends GridPane implements EventHandler<ActionEvent> {

    static final int COLUMNS = 8;
    static final int ROWS = 8;

    static final int NUMBER_OF_SEED = 4;

    Player you;

    Player competitor;

    ChessCell[][] chesscells = new ChessCell[ROWS][COLUMNS];
    
    List<ChessCell> yourMoves = new ArrayList<>();
    List<ChessCell> competitorMoves = new ArrayList<>();

    public ReversiSquare(int w) {
        you = new PersonPlayer();
        competitor = new ComputerPlayer();
        setPrefSize(w, w + 3);
        setMinWidth(w);
        setMinHeight(w + 1);
        setMaxHeight(w + 3);
        setMaxWidth(w + 2);
        setStyle("-fx-border-color: black;");

        EventHandler<MouseEvent> mouseEnterEvent = new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("in");
                ChessCell cell = (ChessCell)event.getSource();
                if (cell.canHint()) {
                    cell.playChess(you.getColor());
                    cell.setHinted(true);
                }
            }
        };
        
        EventHandler<MouseEvent> mouseExitEvent = new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("out");
                ChessCell cell = (ChessCell)event.getSource();
                if (cell.isHinted()) {
                    cell.playChess(ChessColorType.BLANK);
                    cell.setHinted(false);
                }
            }
        };
        
        int squareW = w / COLUMNS;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if ((i + j) % 2 == 0) {
                    ChessCell blackChess = new BlackCell(squareW, i, j);
                    blackChess.setOnAction(this);
                    blackChess.setOnMouseEntered(mouseEnterEvent);
                    blackChess.setOnMouseExited(mouseExitEvent);
                    add(blackChess, j, i);
                    
                    chesscells[i][j] = blackChess;
                } else {
                    WhiteCell whiteChess = new WhiteCell(squareW, i, j);
                    whiteChess.setOnAction(this);
                    whiteChess.setOnMouseEntered(mouseEnterEvent);
                    whiteChess.setOnMouseExited(mouseExitEvent);
                    add(whiteChess, j, i);
                    
                    chesscells[i][j] = whiteChess;
                }
            }
        }

        start();
    }

    public final void start() {
        seed();
    }

    private void seed() {

        for (int row = ROWS / 2 - NUMBER_OF_SEED / 4; row < ROWS / 2 + NUMBER_OF_SEED / 4; row++) {
            for (int column = COLUMNS / 2 - NUMBER_OF_SEED / 4; column < COLUMNS / 2 + NUMBER_OF_SEED / 4; column++) {
                if (chesscells[row][column] instanceof BlackCell) {
                    chesscells[row][column].playChess(you.getColor());
                    yourMoves.add(chesscells[row][column]);
                } else {
                    chesscells[row][column].playChess(competitor.getColor());
                    competitorMoves.add(chesscells[row][column]);
                }
                chesscells[row][column].setPlaced(true);
            }
        }

        // determine the first available cells
        determineAvailableCells();
    }

    public void restartGame() {

    }

    public void gameOver() {

    }

    public void update() {
        // update Moves, Pieces counter
    }

    public void determineAvailableCells() {
        for (ChessCell chesscell : yourMoves) {
            // top
            int index = chesscell.getRow() - 1;
            boolean hasCompetitor = false;
            while(index > 0){
                ChessCell topCell = chesscells[index][chesscell.getColumn()];
                if (topCell.getType() == Config.yourColor) {
                    if (hasCompetitor) {
                        break;
                    }
                    index -= 1;
                }else if(topCell.getType() == ChessColorType.BLANK){
                    topCell.setCanPlaceChess(hasCompetitor);
                    break;
                }
                else{
                    hasCompetitor = true;
                    index -= 1;
                }
            }
            
            // bottom
            index = chesscell.getRow() + 1;
            hasCompetitor = false;
            while(index < ROWS){
                ChessCell cell = chesscells[index][chesscell.getColumn()];
                if (cell.getType() == Config.yourColor) {
                    if (hasCompetitor) {
                        break;
                    }
                    index += 1;
                }else if(cell.getType() == ChessColorType.BLANK){
                    cell.setCanPlaceChess(hasCompetitor);
                    break;
                }
                else{
                    hasCompetitor = true;
                    index += 1;
                }
            }
           
            // left
            index = chesscell.getColumn()- 1;
            hasCompetitor = false;
            while(index > 0){
                ChessCell cell = chesscells[chesscell.getRow()][index];
                if (cell.getType() == Config.yourColor) {
                    if (hasCompetitor) {
                        break;
                    }
                    index -= 1;
                }else if(cell.getType() == ChessColorType.BLANK){
                    cell.setCanPlaceChess(hasCompetitor);
                    break;
                }
                else{
                    hasCompetitor = true;
                    index -= 1;
                }
            }
            
            // right
            index = chesscell.getColumn()+ 1;
            hasCompetitor = false;
            while(index < COLUMNS){
                ChessCell cell = chesscells[chesscell.getRow()][index];
                if (cell.getType() == Config.yourColor) {
                    if (hasCompetitor) {
                        break;
                    }
                    index += 1;
                }else if(cell.getType() == ChessColorType.BLANK){
                    cell.setCanPlaceChess(hasCompetitor);
                    break;
                }
                else{
                    hasCompetitor = true;
                    index += 1;
                }
            }
            
        }
    }

    @Override
    public void handle(ActionEvent event) {
        int move = you.getMoves();
        you.setMoves(move++);
        ChessCell chessCell = (ChessCell) event.getSource();
        System.out.println(chessCell);
        if (chessCell.isCanPlaceChess() && chessCell.getType() == ChessColorType.BLANK) {
            chessCell.playChess(Config.yourColor);
            yourMoves.add(chessCell);
            
            int pieces = you.getPieces();
            you.setPieces(pieces++);

            competitor.playNextTurn(chesscells);
            
            determineAvailableCells();
        }
        update();
    }
}
