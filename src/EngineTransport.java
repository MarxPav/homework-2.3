public abstract class EngineTransport extends Transport {
    protected EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
