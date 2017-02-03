package ec.come.html4j.component.table.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ec.com.html4j.generic.HTMLComponent;

public abstract class GenericTable extends GenericCell {

	private static final long serialVersionUID = -8223246029155168579L;
	private List<HTMLComponent> rows;

	public GenericTable() {
		this.setRows(new ArrayList<>());
	}

	public GenericTable addRow(HTMLComponent row) {
		getRows().add(row);
		return this;
	}

	public GenericTable addRows(HTMLComponent... rows) {
		getRows().addAll(Arrays.asList(rows));
		return this;
	}

	protected List<HTMLComponent> getRows() {
		return rows;
	}

	private void setRows(List<HTMLComponent> rows) {
		this.rows = rows;
	}

}
