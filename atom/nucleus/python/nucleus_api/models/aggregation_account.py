# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.3
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class AggregationAccount(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'account_category_id': 'str',
        'account_holder': 'str',
        'account_name': 'str',
        'account_number': 'str',
        'apr': 'float',
        'apy': 'float',
        'bank_link_id': 'str',
        'business_id': 'str',
        'category': 'str',
        'client_id': 'str',
        'create_date': 'datetime',
        'credit_limit': 'float',
        'currency_code': 'str',
        'death_benefit': 'float',
        'financial_offer_id': 'str',
        'id': 'str',
        'institution_id': 'str',
        'institution_name': 'str',
        'interest_rate': 'float',
        'is_active': 'bool',
        'is_asset': 'bool',
        'is_business': 'bool',
        'is_cash': 'bool',
        'is_investment': 'bool',
        'is_link_verified': 'bool',
        'is_manual': 'bool',
        'last_payment': 'float',
        'last_payment_date': 'datetime',
        'mask': 'str',
        'maturity_date': 'datetime',
        'metadata': 'dict(str, str)',
        'minimum_payment': 'float',
        'next_payment_date': 'datetime',
        'secondary_id': 'str',
        'subcategory': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'account_category_id': 'account_category_id',
        'account_holder': 'account_holder',
        'account_name': 'account_name',
        'account_number': 'account_number',
        'apr': 'apr',
        'apy': 'apy',
        'bank_link_id': 'bank_link_id',
        'business_id': 'business_id',
        'category': 'category',
        'client_id': 'client_id',
        'create_date': 'create_date',
        'credit_limit': 'credit_limit',
        'currency_code': 'currency_code',
        'death_benefit': 'death_benefit',
        'financial_offer_id': 'financial_offer_id',
        'id': 'id',
        'institution_id': 'institution_id',
        'institution_name': 'institution_name',
        'interest_rate': 'interest_rate',
        'is_active': 'is_active',
        'is_asset': 'is_asset',
        'is_business': 'is_business',
        'is_cash': 'is_cash',
        'is_investment': 'is_investment',
        'is_link_verified': 'is_link_verified',
        'is_manual': 'is_manual',
        'last_payment': 'last_payment',
        'last_payment_date': 'last_payment_date',
        'mask': 'mask',
        'maturity_date': 'maturity_date',
        'metadata': 'metadata',
        'minimum_payment': 'minimum_payment',
        'next_payment_date': 'next_payment_date',
        'secondary_id': 'secondary_id',
        'subcategory': 'subcategory',
        'update_date': 'update_date'
    }

    def __init__(self, account_category_id=None, account_holder=None, account_name=None, account_number=None, apr=None, apy=None, bank_link_id=None, business_id=None, category=None, client_id=None, create_date=None, credit_limit=None, currency_code=None, death_benefit=None, financial_offer_id=None, id=None, institution_id=None, institution_name=None, interest_rate=None, is_active=None, is_asset=None, is_business=None, is_cash=None, is_investment=None, is_link_verified=None, is_manual=None, last_payment=None, last_payment_date=None, mask=None, maturity_date=None, metadata=None, minimum_payment=None, next_payment_date=None, secondary_id=None, subcategory=None, update_date=None, _configuration=None):  # noqa: E501
        """AggregationAccount - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._account_category_id = None
        self._account_holder = None
        self._account_name = None
        self._account_number = None
        self._apr = None
        self._apy = None
        self._bank_link_id = None
        self._business_id = None
        self._category = None
        self._client_id = None
        self._create_date = None
        self._credit_limit = None
        self._currency_code = None
        self._death_benefit = None
        self._financial_offer_id = None
        self._id = None
        self._institution_id = None
        self._institution_name = None
        self._interest_rate = None
        self._is_active = None
        self._is_asset = None
        self._is_business = None
        self._is_cash = None
        self._is_investment = None
        self._is_link_verified = None
        self._is_manual = None
        self._last_payment = None
        self._last_payment_date = None
        self._mask = None
        self._maturity_date = None
        self._metadata = None
        self._minimum_payment = None
        self._next_payment_date = None
        self._secondary_id = None
        self._subcategory = None
        self._update_date = None
        self.discriminator = None

        if account_category_id is not None:
            self.account_category_id = account_category_id
        if account_holder is not None:
            self.account_holder = account_holder
        self.account_name = account_name
        if account_number is not None:
            self.account_number = account_number
        if apr is not None:
            self.apr = apr
        if apy is not None:
            self.apy = apy
        if bank_link_id is not None:
            self.bank_link_id = bank_link_id
        if business_id is not None:
            self.business_id = business_id
        self.category = category
        if client_id is not None:
            self.client_id = client_id
        if create_date is not None:
            self.create_date = create_date
        if credit_limit is not None:
            self.credit_limit = credit_limit
        if currency_code is not None:
            self.currency_code = currency_code
        if death_benefit is not None:
            self.death_benefit = death_benefit
        if financial_offer_id is not None:
            self.financial_offer_id = financial_offer_id
        if id is not None:
            self.id = id
        if institution_id is not None:
            self.institution_id = institution_id
        self.institution_name = institution_name
        if interest_rate is not None:
            self.interest_rate = interest_rate
        if is_active is not None:
            self.is_active = is_active
        if is_asset is not None:
            self.is_asset = is_asset
        if is_business is not None:
            self.is_business = is_business
        if is_cash is not None:
            self.is_cash = is_cash
        if is_investment is not None:
            self.is_investment = is_investment
        if is_link_verified is not None:
            self.is_link_verified = is_link_verified
        if is_manual is not None:
            self.is_manual = is_manual
        if last_payment is not None:
            self.last_payment = last_payment
        if last_payment_date is not None:
            self.last_payment_date = last_payment_date
        if mask is not None:
            self.mask = mask
        if maturity_date is not None:
            self.maturity_date = maturity_date
        if metadata is not None:
            self.metadata = metadata
        if minimum_payment is not None:
            self.minimum_payment = minimum_payment
        if next_payment_date is not None:
            self.next_payment_date = next_payment_date
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if subcategory is not None:
            self.subcategory = subcategory
        if update_date is not None:
            self.update_date = update_date

    @property
    def account_category_id(self):
        """Gets the account_category_id of this AggregationAccount.  # noqa: E501

        accountCategoryId  # noqa: E501

        :return: The account_category_id of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._account_category_id

    @account_category_id.setter
    def account_category_id(self, account_category_id):
        """Sets the account_category_id of this AggregationAccount.

        accountCategoryId  # noqa: E501

        :param account_category_id: The account_category_id of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._account_category_id = account_category_id

    @property
    def account_holder(self):
        """Gets the account_holder of this AggregationAccount.  # noqa: E501

        accountHolder  # noqa: E501

        :return: The account_holder of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._account_holder

    @account_holder.setter
    def account_holder(self, account_holder):
        """Sets the account_holder of this AggregationAccount.

        accountHolder  # noqa: E501

        :param account_holder: The account_holder of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._account_holder = account_holder

    @property
    def account_name(self):
        """Gets the account_name of this AggregationAccount.  # noqa: E501

        accountName  # noqa: E501

        :return: The account_name of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._account_name

    @account_name.setter
    def account_name(self, account_name):
        """Sets the account_name of this AggregationAccount.

        accountName  # noqa: E501

        :param account_name: The account_name of this AggregationAccount.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and account_name is None:
            raise ValueError("Invalid value for `account_name`, must not be `None`")  # noqa: E501

        self._account_name = account_name

    @property
    def account_number(self):
        """Gets the account_number of this AggregationAccount.  # noqa: E501


        :return: The account_number of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._account_number

    @account_number.setter
    def account_number(self, account_number):
        """Sets the account_number of this AggregationAccount.


        :param account_number: The account_number of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._account_number = account_number

    @property
    def apr(self):
        """Gets the apr of this AggregationAccount.  # noqa: E501

        apr  # noqa: E501

        :return: The apr of this AggregationAccount.  # noqa: E501
        :rtype: float
        """
        return self._apr

    @apr.setter
    def apr(self, apr):
        """Sets the apr of this AggregationAccount.

        apr  # noqa: E501

        :param apr: The apr of this AggregationAccount.  # noqa: E501
        :type: float
        """

        self._apr = apr

    @property
    def apy(self):
        """Gets the apy of this AggregationAccount.  # noqa: E501

        apy  # noqa: E501

        :return: The apy of this AggregationAccount.  # noqa: E501
        :rtype: float
        """
        return self._apy

    @apy.setter
    def apy(self, apy):
        """Sets the apy of this AggregationAccount.

        apy  # noqa: E501

        :param apy: The apy of this AggregationAccount.  # noqa: E501
        :type: float
        """

        self._apy = apy

    @property
    def bank_link_id(self):
        """Gets the bank_link_id of this AggregationAccount.  # noqa: E501

        bankLinkId  # noqa: E501

        :return: The bank_link_id of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._bank_link_id

    @bank_link_id.setter
    def bank_link_id(self, bank_link_id):
        """Sets the bank_link_id of this AggregationAccount.

        bankLinkId  # noqa: E501

        :param bank_link_id: The bank_link_id of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._bank_link_id = bank_link_id

    @property
    def business_id(self):
        """Gets the business_id of this AggregationAccount.  # noqa: E501

        businessId  # noqa: E501

        :return: The business_id of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id):
        """Sets the business_id of this AggregationAccount.

        businessId  # noqa: E501

        :param business_id: The business_id of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._business_id = business_id

    @property
    def category(self):
        """Gets the category of this AggregationAccount.  # noqa: E501

        category  # noqa: E501

        :return: The category of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this AggregationAccount.

        category  # noqa: E501

        :param category: The category of this AggregationAccount.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and category is None:
            raise ValueError("Invalid value for `category`, must not be `None`")  # noqa: E501

        self._category = category

    @property
    def client_id(self):
        """Gets the client_id of this AggregationAccount.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this AggregationAccount.

        clientId  # noqa: E501

        :param client_id: The client_id of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def create_date(self):
        """Gets the create_date of this AggregationAccount.  # noqa: E501


        :return: The create_date of this AggregationAccount.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this AggregationAccount.


        :param create_date: The create_date of this AggregationAccount.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def credit_limit(self):
        """Gets the credit_limit of this AggregationAccount.  # noqa: E501

        creditLimit  # noqa: E501

        :return: The credit_limit of this AggregationAccount.  # noqa: E501
        :rtype: float
        """
        return self._credit_limit

    @credit_limit.setter
    def credit_limit(self, credit_limit):
        """Sets the credit_limit of this AggregationAccount.

        creditLimit  # noqa: E501

        :param credit_limit: The credit_limit of this AggregationAccount.  # noqa: E501
        :type: float
        """

        self._credit_limit = credit_limit

    @property
    def currency_code(self):
        """Gets the currency_code of this AggregationAccount.  # noqa: E501

        currencyCode  # noqa: E501

        :return: The currency_code of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this AggregationAccount.

        currencyCode  # noqa: E501

        :param currency_code: The currency_code of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def death_benefit(self):
        """Gets the death_benefit of this AggregationAccount.  # noqa: E501

        deathBenefit  # noqa: E501

        :return: The death_benefit of this AggregationAccount.  # noqa: E501
        :rtype: float
        """
        return self._death_benefit

    @death_benefit.setter
    def death_benefit(self, death_benefit):
        """Sets the death_benefit of this AggregationAccount.

        deathBenefit  # noqa: E501

        :param death_benefit: The death_benefit of this AggregationAccount.  # noqa: E501
        :type: float
        """

        self._death_benefit = death_benefit

    @property
    def financial_offer_id(self):
        """Gets the financial_offer_id of this AggregationAccount.  # noqa: E501

        financialOfferId  # noqa: E501

        :return: The financial_offer_id of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._financial_offer_id

    @financial_offer_id.setter
    def financial_offer_id(self, financial_offer_id):
        """Sets the financial_offer_id of this AggregationAccount.

        financialOfferId  # noqa: E501

        :param financial_offer_id: The financial_offer_id of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._financial_offer_id = financial_offer_id

    @property
    def id(self):
        """Gets the id of this AggregationAccount.  # noqa: E501


        :return: The id of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this AggregationAccount.


        :param id: The id of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def institution_id(self):
        """Gets the institution_id of this AggregationAccount.  # noqa: E501

        institutionId  # noqa: E501

        :return: The institution_id of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._institution_id

    @institution_id.setter
    def institution_id(self, institution_id):
        """Sets the institution_id of this AggregationAccount.

        institutionId  # noqa: E501

        :param institution_id: The institution_id of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._institution_id = institution_id

    @property
    def institution_name(self):
        """Gets the institution_name of this AggregationAccount.  # noqa: E501

        institutionName  # noqa: E501

        :return: The institution_name of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._institution_name

    @institution_name.setter
    def institution_name(self, institution_name):
        """Sets the institution_name of this AggregationAccount.

        institutionName  # noqa: E501

        :param institution_name: The institution_name of this AggregationAccount.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and institution_name is None:
            raise ValueError("Invalid value for `institution_name`, must not be `None`")  # noqa: E501

        self._institution_name = institution_name

    @property
    def interest_rate(self):
        """Gets the interest_rate of this AggregationAccount.  # noqa: E501

        interestRate  # noqa: E501

        :return: The interest_rate of this AggregationAccount.  # noqa: E501
        :rtype: float
        """
        return self._interest_rate

    @interest_rate.setter
    def interest_rate(self, interest_rate):
        """Sets the interest_rate of this AggregationAccount.

        interestRate  # noqa: E501

        :param interest_rate: The interest_rate of this AggregationAccount.  # noqa: E501
        :type: float
        """

        self._interest_rate = interest_rate

    @property
    def is_active(self):
        """Gets the is_active of this AggregationAccount.  # noqa: E501

        isActive  # noqa: E501

        :return: The is_active of this AggregationAccount.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this AggregationAccount.

        isActive  # noqa: E501

        :param is_active: The is_active of this AggregationAccount.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def is_asset(self):
        """Gets the is_asset of this AggregationAccount.  # noqa: E501


        :return: The is_asset of this AggregationAccount.  # noqa: E501
        :rtype: bool
        """
        return self._is_asset

    @is_asset.setter
    def is_asset(self, is_asset):
        """Sets the is_asset of this AggregationAccount.


        :param is_asset: The is_asset of this AggregationAccount.  # noqa: E501
        :type: bool
        """

        self._is_asset = is_asset

    @property
    def is_business(self):
        """Gets the is_business of this AggregationAccount.  # noqa: E501


        :return: The is_business of this AggregationAccount.  # noqa: E501
        :rtype: bool
        """
        return self._is_business

    @is_business.setter
    def is_business(self, is_business):
        """Sets the is_business of this AggregationAccount.


        :param is_business: The is_business of this AggregationAccount.  # noqa: E501
        :type: bool
        """

        self._is_business = is_business

    @property
    def is_cash(self):
        """Gets the is_cash of this AggregationAccount.  # noqa: E501


        :return: The is_cash of this AggregationAccount.  # noqa: E501
        :rtype: bool
        """
        return self._is_cash

    @is_cash.setter
    def is_cash(self, is_cash):
        """Sets the is_cash of this AggregationAccount.


        :param is_cash: The is_cash of this AggregationAccount.  # noqa: E501
        :type: bool
        """

        self._is_cash = is_cash

    @property
    def is_investment(self):
        """Gets the is_investment of this AggregationAccount.  # noqa: E501


        :return: The is_investment of this AggregationAccount.  # noqa: E501
        :rtype: bool
        """
        return self._is_investment

    @is_investment.setter
    def is_investment(self, is_investment):
        """Sets the is_investment of this AggregationAccount.


        :param is_investment: The is_investment of this AggregationAccount.  # noqa: E501
        :type: bool
        """

        self._is_investment = is_investment

    @property
    def is_link_verified(self):
        """Gets the is_link_verified of this AggregationAccount.  # noqa: E501

        isLinkVerified  # noqa: E501

        :return: The is_link_verified of this AggregationAccount.  # noqa: E501
        :rtype: bool
        """
        return self._is_link_verified

    @is_link_verified.setter
    def is_link_verified(self, is_link_verified):
        """Sets the is_link_verified of this AggregationAccount.

        isLinkVerified  # noqa: E501

        :param is_link_verified: The is_link_verified of this AggregationAccount.  # noqa: E501
        :type: bool
        """

        self._is_link_verified = is_link_verified

    @property
    def is_manual(self):
        """Gets the is_manual of this AggregationAccount.  # noqa: E501

        isManual  # noqa: E501

        :return: The is_manual of this AggregationAccount.  # noqa: E501
        :rtype: bool
        """
        return self._is_manual

    @is_manual.setter
    def is_manual(self, is_manual):
        """Sets the is_manual of this AggregationAccount.

        isManual  # noqa: E501

        :param is_manual: The is_manual of this AggregationAccount.  # noqa: E501
        :type: bool
        """

        self._is_manual = is_manual

    @property
    def last_payment(self):
        """Gets the last_payment of this AggregationAccount.  # noqa: E501

        lastPayment  # noqa: E501

        :return: The last_payment of this AggregationAccount.  # noqa: E501
        :rtype: float
        """
        return self._last_payment

    @last_payment.setter
    def last_payment(self, last_payment):
        """Sets the last_payment of this AggregationAccount.

        lastPayment  # noqa: E501

        :param last_payment: The last_payment of this AggregationAccount.  # noqa: E501
        :type: float
        """

        self._last_payment = last_payment

    @property
    def last_payment_date(self):
        """Gets the last_payment_date of this AggregationAccount.  # noqa: E501

        lastPaymentDate  # noqa: E501

        :return: The last_payment_date of this AggregationAccount.  # noqa: E501
        :rtype: datetime
        """
        return self._last_payment_date

    @last_payment_date.setter
    def last_payment_date(self, last_payment_date):
        """Sets the last_payment_date of this AggregationAccount.

        lastPaymentDate  # noqa: E501

        :param last_payment_date: The last_payment_date of this AggregationAccount.  # noqa: E501
        :type: datetime
        """

        self._last_payment_date = last_payment_date

    @property
    def mask(self):
        """Gets the mask of this AggregationAccount.  # noqa: E501

        mask  # noqa: E501

        :return: The mask of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._mask

    @mask.setter
    def mask(self, mask):
        """Sets the mask of this AggregationAccount.

        mask  # noqa: E501

        :param mask: The mask of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._mask = mask

    @property
    def maturity_date(self):
        """Gets the maturity_date of this AggregationAccount.  # noqa: E501

        maturityDate  # noqa: E501

        :return: The maturity_date of this AggregationAccount.  # noqa: E501
        :rtype: datetime
        """
        return self._maturity_date

    @maturity_date.setter
    def maturity_date(self, maturity_date):
        """Sets the maturity_date of this AggregationAccount.

        maturityDate  # noqa: E501

        :param maturity_date: The maturity_date of this AggregationAccount.  # noqa: E501
        :type: datetime
        """

        self._maturity_date = maturity_date

    @property
    def metadata(self):
        """Gets the metadata of this AggregationAccount.  # noqa: E501


        :return: The metadata of this AggregationAccount.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this AggregationAccount.


        :param metadata: The metadata of this AggregationAccount.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def minimum_payment(self):
        """Gets the minimum_payment of this AggregationAccount.  # noqa: E501

        minimumPayment  # noqa: E501

        :return: The minimum_payment of this AggregationAccount.  # noqa: E501
        :rtype: float
        """
        return self._minimum_payment

    @minimum_payment.setter
    def minimum_payment(self, minimum_payment):
        """Sets the minimum_payment of this AggregationAccount.

        minimumPayment  # noqa: E501

        :param minimum_payment: The minimum_payment of this AggregationAccount.  # noqa: E501
        :type: float
        """

        self._minimum_payment = minimum_payment

    @property
    def next_payment_date(self):
        """Gets the next_payment_date of this AggregationAccount.  # noqa: E501

        nextPaymentDate  # noqa: E501

        :return: The next_payment_date of this AggregationAccount.  # noqa: E501
        :rtype: datetime
        """
        return self._next_payment_date

    @next_payment_date.setter
    def next_payment_date(self, next_payment_date):
        """Sets the next_payment_date of this AggregationAccount.

        nextPaymentDate  # noqa: E501

        :param next_payment_date: The next_payment_date of this AggregationAccount.  # noqa: E501
        :type: datetime
        """

        self._next_payment_date = next_payment_date

    @property
    def secondary_id(self):
        """Gets the secondary_id of this AggregationAccount.  # noqa: E501


        :return: The secondary_id of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this AggregationAccount.


        :param secondary_id: The secondary_id of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def subcategory(self):
        """Gets the subcategory of this AggregationAccount.  # noqa: E501

        subcategory  # noqa: E501

        :return: The subcategory of this AggregationAccount.  # noqa: E501
        :rtype: str
        """
        return self._subcategory

    @subcategory.setter
    def subcategory(self, subcategory):
        """Sets the subcategory of this AggregationAccount.

        subcategory  # noqa: E501

        :param subcategory: The subcategory of this AggregationAccount.  # noqa: E501
        :type: str
        """

        self._subcategory = subcategory

    @property
    def update_date(self):
        """Gets the update_date of this AggregationAccount.  # noqa: E501


        :return: The update_date of this AggregationAccount.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this AggregationAccount.


        :param update_date: The update_date of this AggregationAccount.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(AggregationAccount, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, AggregationAccount):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AggregationAccount):
            return True

        return self.to_dict() != other.to_dict()
