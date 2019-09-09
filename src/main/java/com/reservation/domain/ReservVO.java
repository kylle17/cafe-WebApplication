package com.reservation.domain;

import org.springframework.stereotype.Component;

@Component
public class ReservVO {
	private int reserv_seq;
	private String reserv_type;
	private String reserv_date;
	private int reserv_rem;
	public int getReserv_seq() {
		return reserv_seq;
	}
	public void setReserv_seq(int reserv_seq) {
		this.reserv_seq = reserv_seq;
	}
	public String getReserv_type() {
		return reserv_type;
	}
	public void setReserv_type(String reserv_type) {
		this.reserv_type = reserv_type;
	}
	public String getReserv_date() {
		return reserv_date;
	}
	public void setReserv_date(String reserv_date) {
		this.reserv_date = reserv_date;
	}
	public int getReserv_rem() {
		return reserv_rem;
	}
	public void setReserv_rem(int reserv_rem) {
		this.reserv_rem = reserv_rem;
	}
	@Override
	public String toString() {
		return "ReservVO [reserv_seq=" + reserv_seq + ", reserv_type=" + reserv_type + ", reserv_date=" + reserv_date + ", reserv_rem="
				+ reserv_rem + "]";
	}

	
}
