package tech.hokkaydo.piece

import tech.hokkaydo.Color

class Queen(x: Int, y: Int, color: Color) extends Piece('q', x, y, color){
    override def canMoveTo(x: Int, y: Int): Boolean = {
        if (Math.abs(this.x - x) == Math.abs(this.y - y)) return true
        if(this.x == x || this.y == y) return true
        false
    }
    override def canAttack(x: Int, y: Int): Boolean = canMoveTo(x, y)
}
