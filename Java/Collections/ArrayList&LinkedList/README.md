# LinkedList vs ArrayList

Diferencias y casos de uso entre las LinkedList y los ArrayList.

### Implementación LinkedList:
LinkedList está implementada como una lista doblemente enlazada. Lo que significa que cada elemento de la lista almacena una referencia al siguiente y al anterior.

### Implementación ArrayList:
ArrayList está implementada como un arreglo dinámico que puede cambiar de tamaño automáticamente a medida que se agregan o eliminan elementos.

![Ejemplo](https://cdn.codegym.cc/images/article/100c27ce-9ff8-447d-b92d-7feabee15a16/original.jpeg)

Fuente de la imagen: [Página de CodeGym](https://codegym.cc/quests/lectures/questsyntax.level08.lecture05)

### Inserción y eliminación DIFERENCIA
LinkedList es más eficiente en términos de inserción y eliminación de elementos, especialmente cuando se trata de operaciones en el medio de la lista. Esto se debe a que no requiere reorganizar elementos contiguos como lo hace ArrayList.

### Acceso a elementos DIFERENCIA
El acceso a los elementos en una LinkedList es más lento que en un ArrayList. Esto se debe a que acceder a un elemento específico requiere recorrer la lista desde el principio o desde el final, dependiendo de dónde esté ubicado el elemento. Mientras que en un ArrayList los elementos están almacenados de forma contigua en memoria y se puede acceder directamente a ellos mediante índices.

#### Cuándo usar LinkedList:
- Cuando se realizan operaciones frecuentes de inserción y eliminación
- Cunaod se necesita hacer una iteración secuencial

#### Cuándo usar ArrayList:
- Cuando se necesita acceder aleatoriamente a elementos
- Para optimizar el uso de memoria
