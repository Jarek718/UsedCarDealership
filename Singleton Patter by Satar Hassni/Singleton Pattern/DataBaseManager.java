import java.util.ArrayList;

public class DataBaseManager {

    private List<CarDataBase> dataBaseList = new ArrayList<CarDataBase>();
    private static DataBaseManager instance;

    public DataBaseManager() {

    }

    public static DataBaseManager getInstance() {
        if (instance == null) {
            instance = new DataBaseManager();
        }
        return instance;
    }

    public List<CarDataBase> getDataBases() {
        return dataBaseList;
    }
}
