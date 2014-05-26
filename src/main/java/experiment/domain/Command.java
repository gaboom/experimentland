package experiment.domain;

/**
 * Suggested generic interface service-like domain objects.
 * @param <SUBJECT_TYPE> Type of input.
 * @param <ARGUMENT_TYPE> Type of output.
 */
public interface Command<SUBJECT_TYPE, ARGUMENT_TYPE> {
	void apply(SUBJECT_TYPE subject, ARGUMENT_TYPE argument);
}
