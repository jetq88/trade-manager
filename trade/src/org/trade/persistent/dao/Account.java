/* ===========================================================
 * TradeManager : a application to trade strategies for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2011-2011, by Simon Allen and Contributors.
 *
 * Project Info:  org.trade
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Oracle, Inc.
 * in the United States and other countries.]
 *
 * (C) Copyright 2011-2011, by Simon Allen and Contributors.
 *
 * Original Author:  Simon Allen;
 * Contributor(s):   -;
 *
 * Changes
 * -------
 *
 */
package org.trade.persistent.dao;

// Generated Feb 21, 2011 2:18:03 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.trade.core.dao.Aspect;

/**
 * Account generated by hbm2java
 * 
 * @author Simon Allen
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "account")
public class Account extends Aspect implements Serializable, Cloneable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 5891080561163346464L;
	private String accountNumber;
	private String accountType;
	private String alias;
	private BigDecimal availableFunds = new BigDecimal(0);
	private BigDecimal buyingPower = new BigDecimal(0);
	private BigDecimal cashBalance = new BigDecimal(0);
	private String currency;
	private BigDecimal grossPositionValue = new BigDecimal(0);
	private String name;
	private BigDecimal realizedPnL = new BigDecimal(0);
	private BigDecimal unrealizedPnL = new BigDecimal(0);
	private Date updateDate;
	private List<PortfolioAccount> portfolioAccounts = new ArrayList<PortfolioAccount>(
			0);

	public Account() {

	}

	/**
	 * Constructor for Account.
	 * 
	 * @param name
	 *            String
	 * @param accountNumber
	 *            String
	 * @param currency
	 *            String
	 * @param isDefault
	 *            Boolean
	 */
	public Account(String name, String accountNumber, String currency) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.currency = currency;
	}

	/**
	 * Constructor for Account.
	 * 
	 * @param accountNumber
	 *            String
	 * @param name
	 *            String
	 * @param availableFunds
	 *            BigDecimal
	 * @param buyingPower
	 *            BigDecimal
	 * @param cashBalance
	 *            BigDecimal
	 * @param currency
	 *            String
	 * @param grossPositionValue
	 *            BigDecimal
	 * @param realizedPnL
	 *            BigDecimal
	 * @param unrealizedPnL
	 *            BigDecimal
	 * @param isDefault
	 *            Boolean
	 * @param tradestrategies
	 *            List<Tradestrategy>
	 */
	public Account(String accountNumber, String name, String accountType,
			BigDecimal availableFunds, BigDecimal buyingPower,
			BigDecimal cashBalance, String currency,
			BigDecimal grossPositionValue, BigDecimal realizedPnL,
			BigDecimal unrealizedPnL) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.name = name;
		this.availableFunds = availableFunds;
		this.buyingPower = buyingPower;
		this.cashBalance = cashBalance;
		this.currency = currency;
		this.grossPositionValue = grossPositionValue;
		this.realizedPnL = realizedPnL;
		this.unrealizedPnL = unrealizedPnL;
	}

	/**
	 * Method getIdAccount.
	 * 
	 * @return Integer
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idAccount", unique = true, nullable = false)
	public Integer getIdAccount() {
		return this.id;
	}

	/**
	 * Method setIdAccount.
	 * 
	 * @param idAccount
	 *            Integer
	 */
	public void setIdAccount(Integer idAccount) {
		this.id = idAccount;
	}

	/**
	 * Method getName.
	 * 
	 * @return String
	 */
	@Column(name = "name", unique = true, nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	/**
	 * Method setName.
	 * 
	 * @param name
	 *            String
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method getAccountNumber.
	 * 
	 * @return String
	 */
	@Column(name = "accountNumber", unique = true, nullable = false, length = 20)
	public String getAccountNumber() {
		return this.accountNumber;
	}

	/**
	 * Method setAccountNumber.
	 * 
	 * @param accountNumber
	 *            String
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Method getAccountType.
	 * 
	 * @return String
	 */
	@Column(name = "accountType", length = 20)
	public String getAccountType() {
		return this.accountType;
	}

	/**
	 * Method setAccountType.
	 * 
	 * @param accountType
	 *            String
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * Method getAlias.
	 * 
	 * @return String
	 */
	@Column(name = "alias", unique = true, nullable = true, length = 45)
	public String getAlias() {
		return this.alias;
	}

	/**
	 * Method setAlias.
	 * 
	 * @param alias
	 *            String
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Method getCurrency.
	 * 
	 * @return String
	 */
	@Column(name = "currency", nullable = false, length = 3)
	public String getCurrency() {
		return this.currency;
	}

	/**
	 * Method setCurrency.
	 * 
	 * @param currency
	 *            String
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * Method getAvailableFunds.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "availableFunds", precision = 10)
	public BigDecimal getAvailableFunds() {
		return this.availableFunds;
	}

	/**
	 * Method setAvailableFunds.
	 * 
	 * @param availableFunds
	 *            BigDecimal
	 */
	public void setAvailableFunds(BigDecimal availableFunds) {
		this.availableFunds = availableFunds;
	}

	/**
	 * Method getBuyingPower.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "buyingPower", precision = 10)
	public BigDecimal getBuyingPower() {
		return this.buyingPower;
	}

	/**
	 * Method setBuyingPower.
	 * 
	 * @param buyingPower
	 *            BigDecimal
	 */
	public void setBuyingPower(BigDecimal buyingPower) {
		this.buyingPower = buyingPower;
	}

	/**
	 * Method getCashBalance.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "cashBalance", precision = 10)
	public BigDecimal getCashBalance() {
		return this.cashBalance;
	}

	/**
	 * Method setCashBalance.
	 * 
	 * @param cashBalance
	 *            BigDecimal
	 */
	public void setCashBalance(BigDecimal cashBalance) {
		this.cashBalance = cashBalance;
	}

	/**
	 * Method getGrossPositionValue.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "grossPositionValue", precision = 10)
	public BigDecimal getGrossPositionValue() {
		return this.grossPositionValue;
	}

	/**
	 * Method setGrossPositionValue.
	 * 
	 * @param grossPositionValue
	 *            BigDecimal
	 */
	public void setGrossPositionValue(BigDecimal grossPositionValue) {
		this.grossPositionValue = grossPositionValue;
	}

	/**
	 * Method getRealizedPnL.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "realizedPnL", precision = 10)
	public BigDecimal getRealizedPnL() {
		return this.realizedPnL;
	}

	/**
	 * Method setRealizedPnL.
	 * 
	 * @param realizedPnL
	 *            BigDecimal
	 */
	public void setRealizedPnL(BigDecimal realizedPnL) {
		this.realizedPnL = realizedPnL;
	}

	/**
	 * Method getUnrealizedPnL.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "unrealizedPnL", precision = 10)
	public BigDecimal getUnrealizedPnL() {
		return this.unrealizedPnL;
	}

	/**
	 * Method setUnrealizedPnL.
	 * 
	 * @param unrealizedPnL
	 *            BigDecimal
	 */
	public void setUnrealizedPnL(BigDecimal unrealizedPnL) {
		this.unrealizedPnL = unrealizedPnL;
	}

	/**
	 * Method getDefaultPortfolio.
	 * 
	 * @return Portfolio
	 */
	@Transient
	public Portfolio getDefaultPortfolio() {
		for (PortfolioAccount item : this.portfolioAccounts) {
			if (item.getPortfolio().getIsDefault()) {
				return item.getPortfolio();
			}
		}
		return null;
	}

	/**
	 * Method getUpdateDate.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateDate", nullable = true, length = 19)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	/**
	 * Method setUpdateDate.
	 * 
	 * @param updateDate
	 *            Date
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * Method getVersion.
	 * 
	 * @return Integer
	 */
	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * Method setVersion.
	 * 
	 * @param version
	 *            Integer
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * Method getPortfolioAccounts.
	 * 
	 * @return List<PortfolioAccounts>
	 */
	@OneToMany(mappedBy = "account", fetch = FetchType.LAZY, orphanRemoval = true, cascade = {
			CascadeType.REFRESH, CascadeType.REMOVE })
	public List<PortfolioAccount> getPortfolioAccounts() {
		return this.portfolioAccounts;
	}

	/**
	 * Method setPortfolioAccounts.
	 * 
	 * @param codeAttributes
	 *            List<CodeAttribute>
	 */
	public void setPortfolioAccounts(List<PortfolioAccount> portfolioAccounts) {
		this.portfolioAccounts = portfolioAccounts;
	}

	/**
	 * Method isDirty.
	 * 
	 * @return boolean
	 */
	@Transient
	public boolean isDirty() {
		for (PortfolioAccount item : this.getPortfolioAccounts()) {
			if (item.isDirty())
				return true;
		}
		return super.isDirty();
	}

	/**
	 * Method clone.
	 * 
	 * @return Object
	 * @throws CloneNotSupportedException
	 */
	public Object clone() throws CloneNotSupportedException {

		Account account = (Account) super.clone();
		return account;
	}

	/**
	 * Method toString.
	 * 
	 * @return String
	 */
	public String toString() {
		return this.getAccountNumber() + "-" + this.getName();
	}

}
