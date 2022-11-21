// Tuplas
val equipoft: List[(String,  Int)] = List(
("Oscar Becerra", 17),
("Luis Amarilla", 16),
("Michael Estrada", 16),
("Fidel Martinez", 16),
("Gonzalo Mastriani", 13)
("Leonel Vides", 13),
("Rodrigo Aguirre", 12)
("Carlo Garces", 12),
("Jonathan Borja", 11))

def promedio (Lst: List[(String, Int)]) = 
  (Lst.map(_._3).sum * 100) / Lst.map(_._5).sum.toDouble
  print(promedio(equipoft))


def masgl1(Lst: List[(String, Int)])=
  Lst.filter(a => a._5 == Lst.map(_._5).max).map{ case (x, _, _) => x}
  print(masgl1(equipoft))

def masgl2 (Lst: List[(String, Int)]) = 
  lst.filter(a => a._5 > 16).map { case (int, -, -,gl) => (int, gl)}.sorted
  print(masgl2(equipoft))


