package tech.hokkaydo.piece

import tech.hokkaydo.Color

abstract class Piece(id: Char, a: Int, b: Int, color: Color) {

    private var x = a
    private var y = b

    def canMoveTo(x: Int, y: Int): Boolean
    def canAttack(x: Int, y: Int): Boolean = canMoveTo(x, y)

    def getChar: Char = id
    def getColor: Color = color

    def moveTo(x: Int, y: Int): Unit = {
        this.x = x
        this.y = y
    }

    override def toString: String = id + ";" + x + ":" + y + ";" + color.name()
}
object Piece {
    def getFromChar(id: Char, x: Int, y: Int, color: Color): Option[Piece] = id match {
        case 'r' => Option.apply(new Rook(x, y, color));
        case 'h' => Option.apply(new Horse(x, y, color));
        case 'f' => Option.apply(new Fool(x, y, color));
        case 'q' => Option.apply(new Queen(x, y, color));
        case 'k' => Option.apply(new King(x, y, color));
        case 'p' => Option.apply(new Pawn(x, y, color));
        case _ => Option.empty[Piece]
    }
}