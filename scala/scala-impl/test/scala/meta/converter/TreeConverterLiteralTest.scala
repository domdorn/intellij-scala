package scala.meta.converter

import scala.meta.TreeConverterTestBaseNoLibrary
import scala.meta._

import scala.collection.immutable.Seq

class TreeConverterLiteralTest extends  TreeConverterTestBaseNoLibrary {
  
  def testTrue() {
    doTest(
      "true",
      Lit.Boolean(true)
    )
  }
  
  def testFalse() {
    doTest(
      "false",
      Lit.Boolean(false)
    )
  }
  
  def testInt() {
    doTest(
      "42",
      Lit.Int(42)
    )
  }
  
  def testLong() {
    doTest(
      "42L",
      Lit.Long(42L)
    )
  }
  
  def testDouble() {
    doTest(
      "42.0",
      Lit.Double(42.0)
    )
  }
  
  def testFloat() {
    doTest(
      "42.0f",
      Lit.Float(42.0f)
    )
  }
  
  def testChar() {
    doTest(
      "'c'",
      Lit.Char('c')
    )
  }
  
  def testString() {
    doTest(
      "\"foo\"",
      Lit.String("foo")
    )
  }

  def testSymbol() {
    doTest(
      "'foo'",
      Term.Apply(Term.Select(Term.Name("scala"), Term.Name("Symbol")), Seq(Lit.String("'foo")))
    )
  }
  
  def testNull() {
    doTest(
      "null",
      Lit.Null(null)
    )
  }

  def testUnit() {
    doTest(
      "()",
      Lit.Unit(())
    )
  }

}
