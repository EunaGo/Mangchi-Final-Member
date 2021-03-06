package com.aia.mangchi.model;

import java.sql.Date;

public class LoginInfo {

	private int mIdx;
	private String mId;
	private String mNick;
	private float mScore;
	private Date mRegdate;
	private String mAddr;
	private double mLttd;
	private double mLgtd;
	private String mImg;
	private int mChk;
	private int mRadius;
	
	public LoginInfo(int mIdx, String mId, String mNick, float mScore, Date mRegdate, String mAddr, double mLttd,
			double mLgtd, String mImg, int mChk, int mRadius) {
		this.mIdx = mIdx;
		this.mId = mId;
		this.mNick = mNick;
		this.mScore = mScore;
		this.mRegdate = mRegdate;
		this.mAddr = mAddr;
		this.mLttd = mLttd;
		this.mLgtd = mLgtd;
		this.mImg = mImg;
		this.mChk = mChk;
		this.mRadius = mRadius;
	}

	public LoginInfo() {}
	
	public int getmIdx() {
		return mIdx;
	}

	public void setmIdx(int mIdx) {
		this.mIdx = mIdx;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmNick() {
		return mNick;
	}

	public void setmNick(String mNick) {
		this.mNick = mNick;
	}

	public float getmScore() {
		return mScore;
	}

	public void setmScore(float mScore) {
		this.mScore = mScore;
	}

	public Date getmRegdate() {
		return mRegdate;
	}

	public void setmRegdate(Date mRegdate) {
		this.mRegdate = mRegdate;
	}

	public String getmAddr() {
		return mAddr;
	}

	public void setmAddr(String mAddr) {
		this.mAddr = mAddr;
	}

	public double getmLttd() {
		return mLttd;
	}

	public void setmLttd(double mLttd) {
		this.mLttd = mLttd;
	}

	public double getmLgtd() {
		return mLgtd;
	}

	public void setmLgtd(double mLgtd) {
		this.mLgtd = mLgtd;
	}

	public String getmImg() {
		return mImg;
	}

	public void setmImg(String mImg) {
		this.mImg = mImg;
	}

	public int getmChk() {
		return mChk;
	}

	public void setmChk(int mChk) {
		this.mChk = mChk;
	}

	public int getmRadius() {
		return mRadius;
	}

	public void setmRadius(int mRadius) {
		this.mRadius = mRadius;
	}

	@Override
	public String toString() {
		return "LoginInfo [mIdx=" + mIdx + ", mId=" + mId + ", mNick=" + mNick + ", mScore=" + mScore + ", mRegdate="
				+ mRegdate + ", mAddr=" + mAddr + ", mLttd=" + mLttd + ", mLgtd=" + mLgtd + ", mImg=" + mImg + ", mChk="
				+ mChk + ", mRadius=" + mRadius + "]";
	}
	
	
}
