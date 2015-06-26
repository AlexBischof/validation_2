package de.bischinger.validation.business;

import de.bischinger.validation.business.strategy.Strategy;
import de.bischinger.validation.model.CompoundKey;

import javax.enterprise.inject.Alternative;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import static java.util.Map.Entry;

/**
 * Created by Alexander Bischof on 25.06.15.
 */
@Alternative
public class StrategyRegistry {

    private final Map<CompoundKey, Strategy> strategyMap;

    Logger logger = Logger.getAnonymousLogger();

    public StrategyRegistry() {
        strategyMap = new HashMap<>();
    }

    public Strategy get(CompoundKey key) {
        logger.info("Getting strategy for Compoundkey " + key);
        return strategyMap.get(key);
    }

    public void register(CompoundKey key, Strategy strategy) {
        logger.info("Registering strategy with key " + key);
        strategyMap.put(key, strategy);
    }

    public Set<Entry<CompoundKey, Strategy>> entrySet() {
        return strategyMap.entrySet();
    }

    @Override public String toString() {
        return "StrategyRegistry{" +
               "strategyMap=" + strategyMap +
               '}';
    }
}
