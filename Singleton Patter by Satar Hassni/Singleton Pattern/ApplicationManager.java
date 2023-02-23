public class ApplicationManager {

    private CarRepo carRepoInstance;
    private UsedCarFactory usedCarFactory;
    private static ApplicationManager instance;

    public ApplicationManager() {
        this.carRepoInstance = new CarRepo();
        this.usedCarFactory = new UsedCarFactory();
    }

    public static ApplicationManager getInstance() {
        if (instance == null) {
            instance = new ApplicationManager();
        }
        return instance;
    }

    public CarRepo carRepoInstance() {
        return carRepoInstance;
    }

    public UsedCarFactory usedCarFactoryInstance() {
        return usedCarFactory;
    }
}
