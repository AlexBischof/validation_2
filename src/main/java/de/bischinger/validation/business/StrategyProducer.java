package de.bischinger.validation.business;

import de.bischinger.validation.business.strategy.Key1aKey2Strategy;
import de.bischinger.validation.model.CompoundKey;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 * Created by Alexander Bischof on 25.06.15.
 */
public class StrategyProducer {
    @Produces @Default public StrategyRegistry create() {
        StrategyRegistry strategyRegistry = new StrategyRegistry();
        strategyRegistry.register(new CompoundKey("eins"), new Key1aKey2Strategy());
        return strategyRegistry;
    }
}
