package zio.magic.macros

import zio.{Has, ZLayer}

import scala.reflect.macros.blackbox

object FromMagicMacros {

  private def assertEnvIsNotNothing[Out <: Has[_]: c.WeakTypeTag, E](c: blackbox.Context): c.Type = {
    import c.universe._

    val outType     = weakTypeOf[Out]
    val nothingType = weakTypeOf[Nothing]
    if (outType == nothingType) {
      val fromMagicName  = fansi.Bold.On("fromMagic")
      val typeAnnotation = fansi.Color.White("[A with B]")
      val errorMessage =
        s"""
           |🪄  You must provide a type to $fromMagicName (e.g. ZIO.fromMagic$typeAnnotation(A.live, B.live))
           |""".stripMargin
      c.abort(c.enclosingPosition, errorMessage)
    }
    outType
  }

  // GENERATED FROM HERE ON

  def fromMagic0Impl[
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )()(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer().toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic1Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(layer1: c.Expr[ZLayer[In1, E, Out1]])(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic2Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(layer1: c.Expr[ZLayer[In1, E, Out1]], layer2: c.Expr[ZLayer[In2, E, Out2]])(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic3Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(layer1: c.Expr[ZLayer[In1, E, Out1]], layer2: c.Expr[ZLayer[In2, E, Out2]], layer3: c.Expr[ZLayer[In3, E, Out3]])(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic4Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic5Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic6Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      In6: c.WeakTypeTag,
      Out6: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]],
      layer6: c.Expr[ZLayer[In6, E, Out6]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5, $layer6).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic7Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      In6: c.WeakTypeTag,
      Out6: c.WeakTypeTag,
      In7: c.WeakTypeTag,
      Out7: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]],
      layer6: c.Expr[ZLayer[In6, E, Out6]],
      layer7: c.Expr[ZLayer[In7, E, Out7]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5, $layer6, $layer7).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic8Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      In6: c.WeakTypeTag,
      Out6: c.WeakTypeTag,
      In7: c.WeakTypeTag,
      Out7: c.WeakTypeTag,
      In8: c.WeakTypeTag,
      Out8: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]],
      layer6: c.Expr[ZLayer[In6, E, Out6]],
      layer7: c.Expr[ZLayer[In7, E, Out7]],
      layer8: c.Expr[ZLayer[In8, E, Out8]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5, $layer6, $layer7, $layer8).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic9Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      In6: c.WeakTypeTag,
      Out6: c.WeakTypeTag,
      In7: c.WeakTypeTag,
      Out7: c.WeakTypeTag,
      In8: c.WeakTypeTag,
      Out8: c.WeakTypeTag,
      In9: c.WeakTypeTag,
      Out9: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]],
      layer6: c.Expr[ZLayer[In6, E, Out6]],
      layer7: c.Expr[ZLayer[In7, E, Out7]],
      layer8: c.Expr[ZLayer[In8, E, Out8]],
      layer9: c.Expr[ZLayer[In9, E, Out9]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5, $layer6, $layer7, $layer8, $layer9).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic10Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      In6: c.WeakTypeTag,
      Out6: c.WeakTypeTag,
      In7: c.WeakTypeTag,
      Out7: c.WeakTypeTag,
      In8: c.WeakTypeTag,
      Out8: c.WeakTypeTag,
      In9: c.WeakTypeTag,
      Out9: c.WeakTypeTag,
      In10: c.WeakTypeTag,
      Out10: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]],
      layer6: c.Expr[ZLayer[In6, E, Out6]],
      layer7: c.Expr[ZLayer[In7, E, Out7]],
      layer8: c.Expr[ZLayer[In8, E, Out8]],
      layer9: c.Expr[ZLayer[In9, E, Out9]],
      layer10: c.Expr[ZLayer[In10, E, Out10]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5, $layer6, $layer7, $layer8, $layer9, $layer10).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic11Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      In6: c.WeakTypeTag,
      Out6: c.WeakTypeTag,
      In7: c.WeakTypeTag,
      Out7: c.WeakTypeTag,
      In8: c.WeakTypeTag,
      Out8: c.WeakTypeTag,
      In9: c.WeakTypeTag,
      Out9: c.WeakTypeTag,
      In10: c.WeakTypeTag,
      Out10: c.WeakTypeTag,
      In11: c.WeakTypeTag,
      Out11: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]],
      layer6: c.Expr[ZLayer[In6, E, Out6]],
      layer7: c.Expr[ZLayer[In7, E, Out7]],
      layer8: c.Expr[ZLayer[In8, E, Out8]],
      layer9: c.Expr[ZLayer[In9, E, Out9]],
      layer10: c.Expr[ZLayer[In10, E, Out10]],
      layer11: c.Expr[ZLayer[In11, E, Out11]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5, $layer6, $layer7, $layer8, $layer9, $layer10, $layer11).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic12Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      In6: c.WeakTypeTag,
      Out6: c.WeakTypeTag,
      In7: c.WeakTypeTag,
      Out7: c.WeakTypeTag,
      In8: c.WeakTypeTag,
      Out8: c.WeakTypeTag,
      In9: c.WeakTypeTag,
      Out9: c.WeakTypeTag,
      In10: c.WeakTypeTag,
      Out10: c.WeakTypeTag,
      In11: c.WeakTypeTag,
      Out11: c.WeakTypeTag,
      In12: c.WeakTypeTag,
      Out12: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]],
      layer6: c.Expr[ZLayer[In6, E, Out6]],
      layer7: c.Expr[ZLayer[In7, E, Out7]],
      layer8: c.Expr[ZLayer[In8, E, Out8]],
      layer9: c.Expr[ZLayer[In9, E, Out9]],
      layer10: c.Expr[ZLayer[In10, E, Out10]],
      layer11: c.Expr[ZLayer[In11, E, Out11]],
      layer12: c.Expr[ZLayer[In12, E, Out12]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5, $layer6, $layer7, $layer8, $layer9, $layer10, $layer11, $layer12).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic13Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      In6: c.WeakTypeTag,
      Out6: c.WeakTypeTag,
      In7: c.WeakTypeTag,
      Out7: c.WeakTypeTag,
      In8: c.WeakTypeTag,
      Out8: c.WeakTypeTag,
      In9: c.WeakTypeTag,
      Out9: c.WeakTypeTag,
      In10: c.WeakTypeTag,
      Out10: c.WeakTypeTag,
      In11: c.WeakTypeTag,
      Out11: c.WeakTypeTag,
      In12: c.WeakTypeTag,
      Out12: c.WeakTypeTag,
      In13: c.WeakTypeTag,
      Out13: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]],
      layer6: c.Expr[ZLayer[In6, E, Out6]],
      layer7: c.Expr[ZLayer[In7, E, Out7]],
      layer8: c.Expr[ZLayer[In8, E, Out8]],
      layer9: c.Expr[ZLayer[In9, E, Out9]],
      layer10: c.Expr[ZLayer[In10, E, Out10]],
      layer11: c.Expr[ZLayer[In11, E, Out11]],
      layer12: c.Expr[ZLayer[In12, E, Out12]],
      layer13: c.Expr[ZLayer[In13, E, Out13]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5, $layer6, $layer7, $layer8, $layer9, $layer10, $layer11, $layer12, $layer13).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic14Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      In6: c.WeakTypeTag,
      Out6: c.WeakTypeTag,
      In7: c.WeakTypeTag,
      Out7: c.WeakTypeTag,
      In8: c.WeakTypeTag,
      Out8: c.WeakTypeTag,
      In9: c.WeakTypeTag,
      Out9: c.WeakTypeTag,
      In10: c.WeakTypeTag,
      Out10: c.WeakTypeTag,
      In11: c.WeakTypeTag,
      Out11: c.WeakTypeTag,
      In12: c.WeakTypeTag,
      Out12: c.WeakTypeTag,
      In13: c.WeakTypeTag,
      Out13: c.WeakTypeTag,
      In14: c.WeakTypeTag,
      Out14: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]],
      layer6: c.Expr[ZLayer[In6, E, Out6]],
      layer7: c.Expr[ZLayer[In7, E, Out7]],
      layer8: c.Expr[ZLayer[In8, E, Out8]],
      layer9: c.Expr[ZLayer[In9, E, Out9]],
      layer10: c.Expr[ZLayer[In10, E, Out10]],
      layer11: c.Expr[ZLayer[In11, E, Out11]],
      layer12: c.Expr[ZLayer[In12, E, Out12]],
      layer13: c.Expr[ZLayer[In13, E, Out13]],
      layer14: c.Expr[ZLayer[In14, E, Out14]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5, $layer6, $layer7, $layer8, $layer9, $layer10, $layer11, $layer12, $layer13, $layer14).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

  def fromMagic15Impl[
      In1: c.WeakTypeTag,
      Out1: c.WeakTypeTag,
      In2: c.WeakTypeTag,
      Out2: c.WeakTypeTag,
      In3: c.WeakTypeTag,
      Out3: c.WeakTypeTag,
      In4: c.WeakTypeTag,
      Out4: c.WeakTypeTag,
      In5: c.WeakTypeTag,
      Out5: c.WeakTypeTag,
      In6: c.WeakTypeTag,
      Out6: c.WeakTypeTag,
      In7: c.WeakTypeTag,
      Out7: c.WeakTypeTag,
      In8: c.WeakTypeTag,
      Out8: c.WeakTypeTag,
      In9: c.WeakTypeTag,
      Out9: c.WeakTypeTag,
      In10: c.WeakTypeTag,
      Out10: c.WeakTypeTag,
      In11: c.WeakTypeTag,
      Out11: c.WeakTypeTag,
      In12: c.WeakTypeTag,
      Out12: c.WeakTypeTag,
      In13: c.WeakTypeTag,
      Out13: c.WeakTypeTag,
      In14: c.WeakTypeTag,
      Out14: c.WeakTypeTag,
      In15: c.WeakTypeTag,
      Out15: c.WeakTypeTag,
      E,
      Out <: Has[_]: c.WeakTypeTag
  ](
      c: blackbox.Context
  )(
      layer1: c.Expr[ZLayer[In1, E, Out1]],
      layer2: c.Expr[ZLayer[In2, E, Out2]],
      layer3: c.Expr[ZLayer[In3, E, Out3]],
      layer4: c.Expr[ZLayer[In4, E, Out4]],
      layer5: c.Expr[ZLayer[In5, E, Out5]],
      layer6: c.Expr[ZLayer[In6, E, Out6]],
      layer7: c.Expr[ZLayer[In7, E, Out7]],
      layer8: c.Expr[ZLayer[In8, E, Out8]],
      layer9: c.Expr[ZLayer[In9, E, Out9]],
      layer10: c.Expr[ZLayer[In10, E, Out10]],
      layer11: c.Expr[ZLayer[In11, E, Out11]],
      layer12: c.Expr[ZLayer[In12, E, Out12]],
      layer13: c.Expr[ZLayer[In13, E, Out13]],
      layer14: c.Expr[ZLayer[In14, E, Out14]],
      layer15: c.Expr[ZLayer[In15, E, Out15]]
  )(
      dummyK: c.Expr[DummyK[Out]]
  ): c.Expr[ZLayer[Any, E, Out]] = {
    import c.universe._

    val outType = assertEnvIsNotNothing(c)

    val tree =
      q"""
        import zio.magic._
        zio.ZIO.environment[$outType].provideMagicLayer($layer1, $layer2, $layer3, $layer4, $layer5, $layer6, $layer7, $layer8, $layer9, $layer10, $layer11, $layer12, $layer13, $layer14, $layer15).toLayerMany
        """

    c.Expr[ZLayer[Any, E, Out]] { tree }
  }

}