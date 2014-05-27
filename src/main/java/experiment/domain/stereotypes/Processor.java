package experiment.domain.stereotypes;

/**
 * Suggested generic interface service-like domain objects.
 * @param <FROM_TYPE> Type of input.
 * @param <TO_TYPE> Type of output.
 */
public interface Processor<FROM_TYPE, TO_TYPE> {
	TO_TYPE process(FROM_TYPE input);
}
