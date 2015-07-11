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

    boolean yourTurn;

    ChessCell[][] chesscells = new ChessCell[ROWS][COLUMNS];

    public ReversiSquare(int w) {
        you = new PersonPlayer();
        yourTurn = true;
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
                if (yourTurn) {
                    ChessCell cell = (ChessCell) event.getSource();
                    if (cell.canHint()) {
                        cell.playChess(you.getColor());
                        cell.setHinted(true);
                    }
                }

            }
        };

        EventHandler<MouseEvent> mouseExitEvent = new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("out");
                if (yourTurn) {
                    ChessCell cell = (ChessCell) event.getSource();
                    if (cell.isHinted()) {
                        cell.playChess(ChessColorType.BLANK);
                        cell.setHinted(false);
                    }
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
                if (chesscells[row][column] instanceof WhiteCell) {
                    you.placeCell(chesscells[row][column]);
                } else {
                    competitor.placeCell(chesscells[row][column]);
                }
                chesscells[row][column].setPlaced(true);
            }
        }

        // determine the first available cells
        determineAvailableCellsOfPlayer(you);
    }

    public void restartGame() {

    }

    public void gameOver() {

    }

    public void update() {
        // update Moves, Pieces counter

    }

    public void updateCells(ChessCell cell, Player player) {
        if (cell.hasTopCell()) {
            ChessCell topCell = chesscells[cell.getRow() - 1][cell.getColumn()];
            while (topCell.getType() != ChessColorType.BLANK && topCell.getType() != cell.getType()) {
                System.out.println("go go");
                topCell.playChess(player.getColor());
                if (topCell.hasTopCell()) {
                    topCell = chesscells[topCell.getRow() - 1][topCell.getColumn()];

                } else {
                    break;
                }
            }
        }

        if (cell.hasBottomCell()) {
            ChessCell topCell = chesscells[cell.getRow() + 1][cell.getColumn()];
            while (topCell.getType() != ChessColorType.BLANK && topCell.getType() != cell.getType()) {
                System.out.println("go go");
                topCell.playChess(player.getColor());
                if (topCell.hasBottomCell()) {
                    topCell = chesscells[topCell.getRow() + 1][topCell.getColumn()];

                } else {
                    break;
                }
            }
        }

        if (cell.hasLeftCell()) {
            ChessCell topCell = chesscells[cell.getRow()][cell.getColumn() - 1];
            while (topCell.getType() != ChessColorType.BLANK && topCell.getType() != cell.getType()) {
                System.out.println("go go");
                topCell.playChess(player.getColor());
                if (topCell.hasLeftCell()) {
                    topCell = chesscells[topCell.getRow()][topCell.getColumn() - 1];

                } else {
                    break;
                }
            }
        }
//
        if (cell.hasRightCell()) {
            ChessCell topCell = chesscells[cell.getRow()][cell.getColumn() + 1];
            while (topCell.getType() != ChessColorType.BLANK && topCell.getType() != cell.getType()) {
                System.out.println("go go");
                topCell.playChess(player.getColor());
                if (topCell.hasRightCell()) {
                    topCell = chesscells[topCell.getRow()][topCell.getColumn() + 1];

                } else {
                    break;
                }
            }
        }
    }

    public List<ChessCell> determineAvailableCellsOfPlayer(Player player) {
        List<ChessCell> result = new ArrayList<>();

        for (ChessCell chesscell : player.getMovedCells()) {
            // top
            int index = chesscell.getRow() - 1;
            boolean hasCompetitor = false;
            while (index > 0) {
                ChessCell topCell = chesscells[index][chesscell.getColumn()];
                if (topCell.getType() == player.getColor()) {
                    if (hasCompetitor) {
                        break;
                    }
                    index -= 1;
                } else if (topCell.getType() == ChessColorType.BLANK) {
                    topCell.setCanPlaceChess(hasCompetitor);
                    if (!hasCompetitor) {
                        result.add(topCell);
                    }
                    break;
                } else {
                    hasCompetitor = true;
                    index -= 1;
                }
            }

            // bottom
            index = chesscell.getRow() + 1;
            hasCompetitor = false;
            while (index < ROWS) {
                ChessCell cell = chesscells[index][chesscell.getColumn()];
                if (cell.getType() == player.getColor()) {
                    if (hasCompetitor) {
                        break;
                    }
                    index += 1;
                } else if (cell.getType() == ChessColorType.BLANK) {
                    cell.setCanPlaceChess(hasCompetitor);
                    if (!hasCompetitor) {
                        result.add(cell);
                    }
                    break;
                } else {
                    hasCompetitor = true;
                    index += 1;
                }
            }

            // left
            index = chesscell.getColumn() - 1;
            hasCompetitor = false;
            while (index > 0) {
                ChessCell cell = chesscells[chesscell.getRow()][index];
                if (cell.getType() == player.getColor()) {
                    if (hasCompetitor) {
                        break;
                    }
                    index -= 1;
                } else if (cell.getType() == ChessColorType.BLANK) {
                    cell.setCanPlaceChess(hasCompetitor);
                    if (!hasCompetitor) {
                        result.add(cell);
                    }
                    break;
                } else {
                    hasCompetitor = true;
                    index -= 1;
                }
            }

            // right
            index = chesscell.getColumn() + 1;
            hasCompetitor = false;
            while (index < COLUMNS) {
                ChessCell cell = chesscells[chesscell.getRow()][index];
                if (cell.getType() == player.getColor()) {
                    if (hasCompetitor) {
                        break;
                    }
                    index += 1;
                } else if (cell.getType() == ChessColorType.BLANK) {
                    cell.setCanPlaceChess(hasCompetitor);
                    if (!hasCompetitor) {
                        result.add(cell);
                    }
                    break;
                } else {
                    hasCompetitor = true;
                    index += 1;
                }
            }

        }

        return result;
    }

    @Override
    public void handle(ActionEvent event) {
        if (yourTurn) {
            int move = you.getMoves();
            you.setMoves(move++);
            ChessCell chessCell = (ChessCell) event.getSource();
            System.out.println(chessCell);
            if (chessCell.isHinted()) {
                chessCell.setHinted(false);
                you.placeCell(chessCell);

                int pieces = you.getPieces();
                you.setPieces(pieces++);

                competitor.playNextTurn(chesscells);

                updateCells(chessCell, you);

                determineAvailableCellsOfPlayer(you);

                yourTurn = false;

                // computer move
                ChessCell nextCell = determineAvailableCellsOfPlayer(competitor).get(0);
                competitor.placeCell(nextCell);
                yourTurn = true;

            }

        } else {

        }

        // update Moves count, Pieces count
        update();
    }
}
