package tech.hokkaydo.piece

import tech.hokkaydo.Color

class Fool(x: Int, y: Int, color: Color) extends Piece('f', x, y, color) {

    override def canMoveTo(x: Int, y: Int): Boolean = Math.abs(this.x - x) == Math.abs(this.y - y)

}
