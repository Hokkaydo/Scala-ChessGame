package tech.hokkaydo.piece

import tech.hokkaydo.Color

class Rook(x: Int, y: Int, color: Color) extends Piece('r', x, y, color) {

    override def canMoveTo(x: Int, y: Int): Boolean = this.x == x || this.y == y
    override def canAttack(x: Int, y: Int): Boolean = canMoveTo(x, y)

}
