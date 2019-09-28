object Suit extends Enumeration {
  type Suit = Value
  val Spades, Diamonds, Hearts, Clubs = Value
}

import Suit._

class Card(val suit: Suit, val value: Int) {
  override def toString: String = "%d of %s".format(value, suit)
}

class Deck() {
  import scala.util.Random
  var deck: List[Card] = getNewDeck

  def shuffle(): Unit = {deck = Random.shuffle(deck)}
  def restart(): Unit = {deck = getNewDeck}
  def draw(amount: Int): List[Card] = {
    for (_ <- List.range(0, amount)) yield
    deck.headOption match {
      case Some(card) => card
      case None =>
        restart()
        shuffle()
        draw(1).head
    }
  }
  private def getNewDeck = for { suit <- Suit.values.toList; value <- List.range(1, 14) } yield new Card(suit, value)
}

class Hand() {
  var hand: List[Card] = List()

  def dealNewHand(cards: List[Card]): Unit = {
    this.hand = cards
  }

  def drawCard(card: Card) = {
    this.hand = hand :+ card
  }

  override def toString: String = {"Cards are:\n" +
    hand.map(_.toString).foldLeft("")((res, str) => res + str + ";") +
    "\nTotal value: %d".format(getScore)}

  def getScore: Int = hand.map(card => card.value).sum

}

object Main extends App {
  new Deck()
  println(new Card(Spades, 10))
  // TODO: execution of Deck and Hand
}