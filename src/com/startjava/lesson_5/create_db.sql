CREATE DATABASE jaegers;

\connect jaegers;

CREATE TABLE Jaegers (
    id        SERIAL PRIMARY KEY, 
    modelName TEXT, 
    mark      INTEGER, 
    height    REAL, 
    weight    REAL, 
    status    TEXT, 
    origin    TEXT, 
    launch    INTEGER, 
    kaijuKill INTEGER
);
