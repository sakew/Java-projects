<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">




	<xsl:template match="/">	
		<html>
		<body>
	
		<h2>Randomly picked Matec conference Articles</h2>
	
		<xsl:apply-templates/>
	
		</body>
		</html>
	
	</xsl:template>
	
	<xsl:template match="articles">
				<p>
				<xsl:apply-templates select="/articles/article/title"/>
				<xsl:apply-templates select="/articles/article/child::authors"/>
				<xsl:apply-templates select="/articles/article/authors/following-sibling::month"/>
				<xsl:apply-templates select="/articles/article/month/following-sibling::year"/>
				<xsl:apply-templates select="/articles/article/ISBN/preceding-sibling::pages"/>
				<xsl:apply-templates select="/articles/article/conferenceTitle/following-sibling::bookTitle"/>
				<xsl:apply-templates select="/articles/article/conferenceTitle/self::conferenceTitle"/>
				<xsl:apply-templates select="/articles/article/year/following::ISBN"/>
				<xsl:apply-templates select="/articles/article/ISBN/preceding::keywords"/>
				<xsl:apply-templates select="/articles/article/editor"/>
				
				</p>
	</xsl:template>
	
	<xsl:template match="title">
		Title: <span style="color:#ff0000">
		<xsl:value-of select="."/></span>	
		<br />
	</xsl:template>	
	
	<xsl:template match="authors">
		Authors: <span style="color:#000000">
		<xsl:value-of select="."/></span>	
		<br />
	</xsl:template>	
	
	<xsl:template match="month">
		Month: <span style="color:#000000">
		<xsl:value-of select="."/></span>	
		<br />
	</xsl:template>		
	<xsl:template match="year">
		Year of the Book: <span style="color:#000000">
		<xsl:value-of select="."/></span>	
		<br />
	</xsl:template>		
	<xsl:template match="pages">
		Number of Pages: <span style="color:#000000">
		<xsl:value-of select="."/></span>	
		<br />
	</xsl:template>		
	<xsl:template match="bookTitle">
		Title of the book: <span style="color:#000000">
		<xsl:value-of select="."/></span>	
		<br />
	</xsl:template>				
		<xsl:template match="conferenceTitle">
		Conference Title: <span style="color:#000000">
		<xsl:value-of select="."/></span>	
		<br />
	</xsl:template>
	<xsl:template match="ISBN">
		ISBN: <span style="color:#000000">
		<xsl:value-of select="."/></span>	
		<br />
	</xsl:template>
	<xsl:template match="keywords">
		Keywords: <span style="color:#000000">
		<xsl:value-of select="."/></span>	
		<br />
	</xsl:template>
	<xsl:template match="editor">
		Book Editors: <span style="color:#000000">
		<xsl:value-of select="."/></span>	
		<br />
	</xsl:template>
</xsl:stylesheet>