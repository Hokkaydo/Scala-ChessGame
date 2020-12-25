package tech.hokkaydo.piece

import tech.hokkaydo.Color

class Pawn(x: Int, y: Int, color: Color) extends Piece('p', x, y, color){
    override def canMoveTo(x: Int, y: Int): Boolean = x - this.x == 1 && this.y == y
    override def canAttack(x: Int, y: Int): Boolean = x - this.x == 1 && Math.abs(this.y - y) == 1
}
