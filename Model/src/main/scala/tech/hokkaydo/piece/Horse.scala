package tech.hokkaydo.piece

import tech.hokkaydo.Color

class Horse(x: Int, y: Int, color: Color) extends Piece('h', x, y, color) {

    override def canMoveTo(x: Int, y: Int): Boolean = {
        if (Math.abs(this.x - x) <= 2 && Math.abs(this.y - y) == 1) return true
        if(Math.abs(this.x - x) == 1 && Math.abs(this.y - y) <= 2) return true
        false
    }

}
