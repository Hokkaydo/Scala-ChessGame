package tech.hokkaydo

import tech.hokkaydo.piece.Piece

class Board {
    private val initialBoard = Array(
        'r', 'h', 'f', 'q', 'k', 'f', 'h', 'r',
        'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p',
        ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
        ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
        ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
        ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
        'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p',
        'r', 'h', 'f', 'k', 'q', 'f', 'h', 'r',
    )

    private final val board = Array.tabulate[Option[Piece]](8, 8)((_, _) => Option.empty[Piece])

    def setup(): Unit = {
        var i = 0
        val pieceAmount = 32
        for(x <- 0 to 7) {
            for(y <- 0 to 7) {
                if(initialBoard(i).equals(' '))
                    board(x).update(y, null)
                else
                    board(x).update(y, Piece.getFromChar(initialBoard(i), x, y, if (i < pieceAmount / 2) Color.BLACK else Color.WHITE))
                    print(Piece.getFromChar(initialBoard(i), x, y, if (i < pieceAmount / 2) Color.BLACK else Color.WHITE))
                i+=1
            }
        }
    }
}
