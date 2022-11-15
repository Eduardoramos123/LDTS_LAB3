public class FerengiClient extends AlienClient {
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        SmartStrategy strategy = new SmartStrategy();
        return strategy;
    }
}
