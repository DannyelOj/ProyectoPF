//1. Crear una funcion
def integracion(a: Double, b: Double,f: (Double) => Double): Double = {
  val x: Double = (a + b) / 2
  (b - a) * (f(a) + 4 * f((a + b) / 2) + f(b)) / 6
}

//2.Aproxima el valor de las siguientes integrales definidas usando la función integracion creada en el paso 1.
//función 1
val fa1 = (a:Double) => -Math.pow(a,2) + (8*a) - 12
integracion(3,5,fa1)
//función 2
val fa2 = (a:Double) => 3 * Math.pow(a,2)
integracion(0,2,fa2)
//función 3
val fa3 = (a:Double) => (a + 2*Math.pow(a,2) - Math.pow(a,3) + 5* Math.pow(a,4))
integracion(-1,1,fa3)
//función 4
val fa4 = (a:Double) => (2*a +1)/(Math.pow(a,2) + a)
integracion(1,2,fa4)
//función 5
val fa5 = (a:Double) => scala.math.exp(a)
integracion(0,1,fa5)
//función 6
val fa6 = (a:Double) => (1)/(Math.sqrt(a-1))
integracion(2,3,fa6)
//función 7
val fa7 = (a:Double) => (1)/(1+Math.pow(a,2))
integracion(0,1,fa7)

/*3.Calcula el error que se presenta en cada aproximación. El error es igual al valor absoluto de la resta entre el valor
esperado y el valor obtenido, así*/

def calcularError1 ( result: Double): Double =
  val prop = 7.33
  (prop - result ).abs
calcularError1(integracion(3,5,fa1))

def calcularError2 ( result: Double): Double =
  val prop = 8
  (prop - result ).abs
calcularError2(integracion(3,5,fa2))

def calcularError3 ( result: Double): Double =
  val prop = 3.333
  (prop - result ).abs
calcularError3(integracion(-1,1,fa3))

def calcularError4 ( result: Double): Double =
  val prop = 1.09861
  (prop - result ).abs
calcularError4(integracion(1,2,fa4))

def calcularError5 ( result: Double): Double =
  val prop = 1.71828
  (prop - result ).abs
calcularError5(integracion(0,1,fa5))

def calcularError6 ( result: Double): Double =
  val prop = 0.828427
  (prop - result ).abs
calcularError6(integracion(2,3,fa6))

def calcularError7 ( result: Double): Double =
  val prop = 0.785398
  (prop - result ).abs
calcularError7(integracion(0,1,fa7))