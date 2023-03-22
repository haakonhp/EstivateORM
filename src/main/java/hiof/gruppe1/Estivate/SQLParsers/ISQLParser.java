package hiof.gruppe1.Estivate.SQLParsers;

import hiof.gruppe1.Estivate.Objects.SQLMultiCommand;
import hiof.gruppe1.Estivate.Objects.SQLWriteObject;

public interface ISQLParser {
    public Boolean writeToDatabase(SQLMultiCommand multiCommand);

    public Boolean writeToDatabase(SQLWriteObject writeObject);
}
