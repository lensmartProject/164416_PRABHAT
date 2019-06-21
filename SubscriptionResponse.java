package com.vmware.csp.InvoiceBilling;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubscriptionResponse {
	
	@JsonProperty("sid")
	public String sid;	
	@JsonProperty("startDate")
	public String startDate;
	@JsonProperty("endDate")
	public String endDate;
	@JsonProperty("unpaid")
	public String unpaid;	
	@JsonProperty("paid")
	public String paid;
	@JsonProperty("total")
	public String total;
	@JsonProperty("currency")
	public String currency;
	@JsonProperty("commitmentTerm")
	public String commitmentTerm;
	@JsonProperty("commitmentTermUOM")
	public String commitmentTermUOM;
	@JsonProperty("invoices")
	public List<InvoicesResponse> invoices = new ArrayList<InvoicesResponse>();
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getUnpaid() {
		return unpaid;
	}
	public void setUnpaid(String unpaid) {
		this.unpaid = unpaid;
	}
	public String getPaid() {
		return paid;
	}
	public void setPaid(String paid) {
		this.paid = paid;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<InvoicesResponse> getInvoices() {
		return invoices;
	}
	public void setInvoices(List<InvoicesResponse> invoices) {
		this.invoices = invoices;
	}
	public String getCommitmentTerm() {
		return commitmentTerm;
	}
	public void setCommitmentTerm(String commitmentTerm) {
		this.commitmentTerm = commitmentTerm;
	}
	public String getCommitmentTermUOM() {
		return commitmentTermUOM;
	}
	public void setCommitmentTermUOM(String commitmentTermUOM) {
		this.commitmentTermUOM = commitmentTermUOM;
	}
	
}
