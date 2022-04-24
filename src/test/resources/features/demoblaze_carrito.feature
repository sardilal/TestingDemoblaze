# language: es
Característica: Carrito de compras
  Como usuario admin de Demoblaze
  Deseo poder agregar elementos al carrito
  Para comprarlos

  Escenario: Agregar Samsung galaxy s6 al carrito vacio como admin
    Dado que "Nicolas" se loguea como "admin"
    Cuando agrega el "Samsung galaxy s6" al carrito vacio
    Entonces debe ver como unico elemento el "Samsung galaxy s6"
