/*
# 3. Los habitantes de Barcelona (2 puntos) 
En la ciudad de Barcelona hay 5.150.000 de habitantes. Nos solicitan un software 
que es capaz de filtrar por *edad, id y barrio*. Para ello yo tengo un metodo que 
recibe como parametro un objeto con los siguientes attributos id,edad,barrio, 
además del array de habitantes.
Dada la siguiente function que filtra por esos valores ¿Que ocurre en los siguientes 
casos? esto es un lenguaje inventado que no es ni Java ni C# ni JavaScript
       
fun filter(array,predicate){                    
    for(int i = 0; i< array.length; i++){
        if (
            (array[i].id == predicate.id or predicate.id == null)
            and
            (array[i].edad == predicate.edad or predicate.edad == null)
            and
            (array[i].barrio == predicate.barrio or predicate.barrio == null)
            ) {
                imprime(array[i])
            }
        }
    }
}

a) El valor del objeto de filtro es {id:null,edad:null,barrio:null}. Cuantos 
resultados tengo
b) Todos los usuarios tienen un id correlativo que se obtiene sumando uno al 
ultimo de los habitantes de Barcelona. Si hago la consulta {id:55000} cuantos 
resultados obtengo?


*/