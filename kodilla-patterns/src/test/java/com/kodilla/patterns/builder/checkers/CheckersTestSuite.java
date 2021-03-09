package com.kodilla.patterns.builder.checkers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CheckersTestSuite {

    @Test
    void testCheckersBuilder() {
        //Given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("John")
                .PlayerTwo("Teresa")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 9, 7)
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 0, 2)
                .build();
        System.out.println(checkers.getBoard());

        //When
        Figure figure1 = checkers.getBoard().getFigure(0, 3);
        Figure figure2 = checkers.getBoard().getFigure(9, 7);
        Figure figure3 = checkers.getBoard().getFigure(0, 2);
        Figure figure4 = checkers.getBoard().getFigure(1, 1);

        //Then
        assertEquals(Figure.WHITE, figure1.getColor());
        assertEquals(Pawn.class, figure2.getClass());
        assertEquals(Queen.class, figure3.getClass());
        assertNull(figure4);
    }
}
