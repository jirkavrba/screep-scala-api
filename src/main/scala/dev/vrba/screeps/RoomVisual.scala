package dev.vrba.screeps

import scala.scalajs.js

//noinspection ScalaUnusedSymbol
@js.native
abstract class RoomVisual(roomName: Option[String] = None) extends js.Object {

  @js.native
  trait LineStyle extends js.Object {
    val width: Float = 0.1f
    val color: String = "#ffffff"
    val opacity: Float = 0.5f
    val lineStyle: String = "undefined"
  }

  def line(x1: Int, y1: Int, x2: Int, y2: Int, style: Option[LineStyle] = None): this.type = js.native

  def line(pos1: RoomPosition, pos2: RoomPosition, style: Option[LineStyle] = None): this.type = js.native

  @js.native
  trait CircleStyle extends js.Object {
    val radius: Float = 0.15f
    val fill: String = "#ffffff"
    val opacity: Float = 0.5f
    val stroke: String = "undefined"
    val strokeWidth: Float = 0.1f
    val lineStyle: String = "undefined"
  }

  def circle(x: Int, y: Int, style: CircleStyle)

  def circle(pos: RoomPosition, style: CircleStyle)

  @js.native
  trait RectStyle extends js.Object {
    val fill: String = "#ffffff"
    val opacity: Float = 0.5f
    val stroke: String = "undefined"
  }

  def rect(x: Int, y: Int, width: Int, height: Int, style: Option[RectStyle] = None): this.type = js.native

  def rect(topLeftPos: RoomPosition, width: Int, height: Int, style: Option[RectStyle] = None): this.type = js.native

  @js.native
  trait PolyStyle extends js.Object {
    val fill: String = "undefined"
    val opacity: Float = 0.5f
    val stroke: String = "#ffffff"
    val strokeWidth: Float = 0.1f
    val lineStyle: String = "undefined"
  }

  def poly(points: Array[RoomPosition], style: Option[PolyStyle] = None): this.type = js.native

  @js.native
  trait TextStyle extends js.Object {
    val color: String = "#ffffff"
    val font: Either[Int, String] = Right("undefined")
    val stroke: String = "undefined"
    val strokeWidth: Float = 0.15f
    val backgroundColor: String = "undefined"
    val backgroundPadding: Float = 0.3f
    val align: String = "center"
    val opacity: Float = 0.1f
  }

  def text(text: String, x: Int, y: Int, style: Option[TextStyle] = None): this.type = js.native

  def text(text: String, pos: RoomPosition, style: Option[TextStyle] = None): this.type = js.native

  def clear(): this.type = js.native

  def getSize(): Int = js.native

  def export(): String = js.native

  def `import`(`val`: String): this.type = js.native
}
