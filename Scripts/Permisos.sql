--LOGIN
---------------------------------------------------------
sp_addlogin gerente,1234,BD_EQUIPO_FUTBOL,spanish
sp_addlogin jugador,1234,BD_EQUIPO_FUTBOL,spanish


sp_addrole jugadores
sp_addrole directivos

sp_adduser gerente,G1,directivos
sp_adduser jugador,Player1,jugadores

---------------------------------------------------------DT
GRANT SELECT,INSERT,UPDATE,DELETE
ON jugador
to G1

GRANT SELECT,INSERT,UPDATE,DELETE
ON estadisticas
to G1

GRANT SELECT,INSERT,UPDATE,DELETE
ON detalle_partido
to G1

GRANT SELECT,INSERT,UPDATE,DELETE
ON partido
to G1
---------------------------------------------------------JUGADOR
GRANT SELECT
ON jugador
to Player1

GRANT SELECT
ON estadisticas
to Player1

GRANT SELECT
ON detalle_partido
to Player1

GRANT SELECT
ON partido
to Player1
