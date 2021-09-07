# springBootHazelcast
Proyecto Rest Springboot con cache Hazelcast

- GET **/counter/count/{id}** Retorna 0 y lo almacena en la cache, las siguientes veces retorna el valor almacenado en la cache
- PUT **/counter/count/{id}** Actualiza la cache aumentando el valor almacenado en 1