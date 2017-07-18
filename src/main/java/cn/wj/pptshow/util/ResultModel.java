package cn.wj.pptshow.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonPropertyOrder({"code", "version", "data"})
public class ResultModel
{

	private int code;
	@JsonProperty("version")
	private String version;
	private LinkedHashMap<String, Object> data = new LinkedHashMap();

	public ResultModel addAttribute(String attributeName, Object attributeValue)
	{
		data.put(attributeName, attributeValue);
		return this;
	}

	public int getCode()
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public String getVersion()
	{
		return version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	public LinkedHashMap<String, Object> getData()
	{
		return data;
	}

	public void setData(LinkedHashMap<String, Object> data)
	{
		this.data = data;
	}

	public ResultModel addAttributeT(String attributeName, Object attributeValue)
	{
		data.put(attributeName, attributeValue);
		return this;
	}

	public ResultModel addAllAttribute(Map map)
	{
		data.putAll(map);
		return this;
	}

}
