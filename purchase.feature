Feature: Purchase

Scenario: Comprar en linea
Given El cliente ingresa a la página de comprar
And el cliente tiene crédito para comprar
When El cliente seleccione el departamento 
And El cliente seleccione un artículo
Then El cliente podrá colocar el artículo en el carrito de compras
And El cliente podrá concluir la compra y proceder con el pago