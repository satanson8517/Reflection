package com.avg.mne.reflection;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 28/01/2016
 */
public class Private {
	public final String _final_public_;
	protected final String _final_protected_;
	final String _final_package_protected_;
	private final String _final_private_;

	public String _public_;
	protected String _protected_;
	String _package_protected_;
	private String _private_;

	public Private() {
		this._final_public_ = "_final_public_value_";
		this._final_protected_ = "_final_protected_value_";
		this._final_package_protected_ = "_final_package_protected_value_";
		this._final_private_ = "_final_private_value_";
		this._public_ = "_public_value_";
		this._protected_ = "_protected_value_";
		this._package_protected_ = "_package_protected_value_";
		this._private_ = "_private_value_";
	}

	public String getPrivate_() {
		return _private_;
	}
	
	private class Inner{}
	
}
