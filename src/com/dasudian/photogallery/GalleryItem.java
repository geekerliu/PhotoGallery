package com.dasudian.photogallery;

public class GalleryItem {
	private String mCaption;
	private String mId;
	private String mUrl;
	private String mOwner;

	public String getmCaption() {
		return mCaption;
	}

	public void setmCaption(String mCaption) {
		this.mCaption = mCaption;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmUrl() {
		return mUrl;
	}

	public void setmUrl(String mUrl) {
		this.mUrl = mUrl;
	}

	public String getOwner() {
		return mOwner;
	}

	public void setOwner(String owner) {
		mOwner = owner;
	}

	public String getPhotoPageUrl() {
		return "https://www.flickr.com/photos/" + mOwner + "/" + mId;
	}

	@Override
	public String toString() {
		return mCaption;
	}
}
