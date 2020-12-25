package tech.hokkaydo.piece

import tech.hokkaydo.Color

class King(x: Int, y: Int, color: Color) extends Piece('k', x, y, color) {
    override def canMoveTo(x: Int, y: Int): Boolean = Math.abs(this.x - x) <= 1 && Math.abs(this.y - y) <= 1
}
