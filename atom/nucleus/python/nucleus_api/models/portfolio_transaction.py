# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class PortfolioTransaction(object):
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
        'account_id': 'str',
        'amount': 'float',
        'balance': 'float',
        'category': 'str',
        'check': 'Check',
        'create_date': 'datetime',
        'currency_code': 'str',
        '_date': 'datetime',
        'date_available': 'datetime',
        'description': 'str',
        'funding_id': 'str',
        'id': 'str',
        'is_cleansed': 'bool',
        'is_disputed': 'bool',
        'is_read': 'bool',
        'is_recurring': 'bool',
        'location': 'Location',
        'memo': 'str',
        'merchant': 'str',
        'merchant_category_code': 'str',
        'merchant_id': 'str',
        'metadata': 'dict(str, str)',
        'mid': 'str',
        'model_id': 'str',
        'portfolio_id': 'str',
        'price': 'float',
        'quantity': 'float',
        'secondary_id': 'str',
        'security_id': 'str',
        'status': 'str',
        'subcategory': 'str',
        'transaction_category_id': 'str',
        'transaction_code_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'account_id': 'account_id',
        'amount': 'amount',
        'balance': 'balance',
        'category': 'category',
        'check': 'check',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        '_date': 'date',
        'date_available': 'date_available',
        'description': 'description',
        'funding_id': 'funding_id',
        'id': 'id',
        'is_cleansed': 'is_cleansed',
        'is_disputed': 'is_disputed',
        'is_read': 'is_read',
        'is_recurring': 'is_recurring',
        'location': 'location',
        'memo': 'memo',
        'merchant': 'merchant',
        'merchant_category_code': 'merchant_category_code',
        'merchant_id': 'merchant_id',
        'metadata': 'metadata',
        'mid': 'mid',
        'model_id': 'model_id',
        'portfolio_id': 'portfolio_id',
        'price': 'price',
        'quantity': 'quantity',
        'secondary_id': 'secondary_id',
        'security_id': 'security_id',
        'status': 'status',
        'subcategory': 'subcategory',
        'transaction_category_id': 'transaction_category_id',
        'transaction_code_id': 'transaction_code_id',
        'update_date': 'update_date'
    }

    def __init__(self, account_id=None, amount=None, balance=None, category=None, check=None, create_date=None, currency_code=None, _date=None, date_available=None, description=None, funding_id=None, id=None, is_cleansed=None, is_disputed=None, is_read=None, is_recurring=None, location=None, memo=None, merchant=None, merchant_category_code=None, merchant_id=None, metadata=None, mid=None, model_id=None, portfolio_id=None, price=None, quantity=None, secondary_id=None, security_id=None, status=None, subcategory=None, transaction_category_id=None, transaction_code_id=None, update_date=None, _configuration=None):  # noqa: E501
        """PortfolioTransaction - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._account_id = None
        self._amount = None
        self._balance = None
        self._category = None
        self._check = None
        self._create_date = None
        self._currency_code = None
        self.__date = None
        self._date_available = None
        self._description = None
        self._funding_id = None
        self._id = None
        self._is_cleansed = None
        self._is_disputed = None
        self._is_read = None
        self._is_recurring = None
        self._location = None
        self._memo = None
        self._merchant = None
        self._merchant_category_code = None
        self._merchant_id = None
        self._metadata = None
        self._mid = None
        self._model_id = None
        self._portfolio_id = None
        self._price = None
        self._quantity = None
        self._secondary_id = None
        self._security_id = None
        self._status = None
        self._subcategory = None
        self._transaction_category_id = None
        self._transaction_code_id = None
        self._update_date = None
        self.discriminator = None

        self.account_id = account_id
        if amount is not None:
            self.amount = amount
        if balance is not None:
            self.balance = balance
        if category is not None:
            self.category = category
        if check is not None:
            self.check = check
        if create_date is not None:
            self.create_date = create_date
        if currency_code is not None:
            self.currency_code = currency_code
        self._date = _date
        if date_available is not None:
            self.date_available = date_available
        if description is not None:
            self.description = description
        if funding_id is not None:
            self.funding_id = funding_id
        if id is not None:
            self.id = id
        if is_cleansed is not None:
            self.is_cleansed = is_cleansed
        if is_disputed is not None:
            self.is_disputed = is_disputed
        if is_read is not None:
            self.is_read = is_read
        if is_recurring is not None:
            self.is_recurring = is_recurring
        if location is not None:
            self.location = location
        if memo is not None:
            self.memo = memo
        if merchant is not None:
            self.merchant = merchant
        if merchant_category_code is not None:
            self.merchant_category_code = merchant_category_code
        if merchant_id is not None:
            self.merchant_id = merchant_id
        if metadata is not None:
            self.metadata = metadata
        if mid is not None:
            self.mid = mid
        self.model_id = model_id
        self.portfolio_id = portfolio_id
        if price is not None:
            self.price = price
        if quantity is not None:
            self.quantity = quantity
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if security_id is not None:
            self.security_id = security_id
        if status is not None:
            self.status = status
        if subcategory is not None:
            self.subcategory = subcategory
        if transaction_category_id is not None:
            self.transaction_category_id = transaction_category_id
        self.transaction_code_id = transaction_code_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def account_id(self):
        """Gets the account_id of this PortfolioTransaction.  # noqa: E501

        accountId  # noqa: E501

        :return: The account_id of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this PortfolioTransaction.

        accountId  # noqa: E501

        :param account_id: The account_id of this PortfolioTransaction.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

    @property
    def amount(self):
        """Gets the amount of this PortfolioTransaction.  # noqa: E501

        amount  # noqa: E501

        :return: The amount of this PortfolioTransaction.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this PortfolioTransaction.

        amount  # noqa: E501

        :param amount: The amount of this PortfolioTransaction.  # noqa: E501
        :type: float
        """

        self._amount = amount

    @property
    def balance(self):
        """Gets the balance of this PortfolioTransaction.  # noqa: E501

        balance  # noqa: E501

        :return: The balance of this PortfolioTransaction.  # noqa: E501
        :rtype: float
        """
        return self._balance

    @balance.setter
    def balance(self, balance):
        """Sets the balance of this PortfolioTransaction.

        balance  # noqa: E501

        :param balance: The balance of this PortfolioTransaction.  # noqa: E501
        :type: float
        """

        self._balance = balance

    @property
    def category(self):
        """Gets the category of this PortfolioTransaction.  # noqa: E501

        category  # noqa: E501

        :return: The category of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this PortfolioTransaction.

        category  # noqa: E501

        :param category: The category of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._category = category

    @property
    def check(self):
        """Gets the check of this PortfolioTransaction.  # noqa: E501


        :return: The check of this PortfolioTransaction.  # noqa: E501
        :rtype: Check
        """
        return self._check

    @check.setter
    def check(self, check):
        """Sets the check of this PortfolioTransaction.


        :param check: The check of this PortfolioTransaction.  # noqa: E501
        :type: Check
        """

        self._check = check

    @property
    def create_date(self):
        """Gets the create_date of this PortfolioTransaction.  # noqa: E501


        :return: The create_date of this PortfolioTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this PortfolioTransaction.


        :param create_date: The create_date of this PortfolioTransaction.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this PortfolioTransaction.  # noqa: E501

        currency_code  # noqa: E501

        :return: The currency_code of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this PortfolioTransaction.

        currency_code  # noqa: E501

        :param currency_code: The currency_code of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def _date(self):
        """Gets the _date of this PortfolioTransaction.  # noqa: E501

        date  # noqa: E501

        :return: The _date of this PortfolioTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this PortfolioTransaction.

        date  # noqa: E501

        :param _date: The _date of this PortfolioTransaction.  # noqa: E501
        :type: datetime
        """
        if self._configuration.client_side_validation and _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def date_available(self):
        """Gets the date_available of this PortfolioTransaction.  # noqa: E501

        dateAvailable  # noqa: E501

        :return: The date_available of this PortfolioTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self._date_available

    @date_available.setter
    def date_available(self, date_available):
        """Sets the date_available of this PortfolioTransaction.

        dateAvailable  # noqa: E501

        :param date_available: The date_available of this PortfolioTransaction.  # noqa: E501
        :type: datetime
        """

        self._date_available = date_available

    @property
    def description(self):
        """Gets the description of this PortfolioTransaction.  # noqa: E501

        description  # noqa: E501

        :return: The description of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this PortfolioTransaction.

        description  # noqa: E501

        :param description: The description of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def funding_id(self):
        """Gets the funding_id of this PortfolioTransaction.  # noqa: E501

        fundingId  # noqa: E501

        :return: The funding_id of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._funding_id

    @funding_id.setter
    def funding_id(self, funding_id):
        """Sets the funding_id of this PortfolioTransaction.

        fundingId  # noqa: E501

        :param funding_id: The funding_id of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._funding_id = funding_id

    @property
    def id(self):
        """Gets the id of this PortfolioTransaction.  # noqa: E501


        :return: The id of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PortfolioTransaction.


        :param id: The id of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_cleansed(self):
        """Gets the is_cleansed of this PortfolioTransaction.  # noqa: E501

        is_cleansed  # noqa: E501

        :return: The is_cleansed of this PortfolioTransaction.  # noqa: E501
        :rtype: bool
        """
        return self._is_cleansed

    @is_cleansed.setter
    def is_cleansed(self, is_cleansed):
        """Sets the is_cleansed of this PortfolioTransaction.

        is_cleansed  # noqa: E501

        :param is_cleansed: The is_cleansed of this PortfolioTransaction.  # noqa: E501
        :type: bool
        """

        self._is_cleansed = is_cleansed

    @property
    def is_disputed(self):
        """Gets the is_disputed of this PortfolioTransaction.  # noqa: E501

        is_disputed  # noqa: E501

        :return: The is_disputed of this PortfolioTransaction.  # noqa: E501
        :rtype: bool
        """
        return self._is_disputed

    @is_disputed.setter
    def is_disputed(self, is_disputed):
        """Sets the is_disputed of this PortfolioTransaction.

        is_disputed  # noqa: E501

        :param is_disputed: The is_disputed of this PortfolioTransaction.  # noqa: E501
        :type: bool
        """

        self._is_disputed = is_disputed

    @property
    def is_read(self):
        """Gets the is_read of this PortfolioTransaction.  # noqa: E501

        isRead  # noqa: E501

        :return: The is_read of this PortfolioTransaction.  # noqa: E501
        :rtype: bool
        """
        return self._is_read

    @is_read.setter
    def is_read(self, is_read):
        """Sets the is_read of this PortfolioTransaction.

        isRead  # noqa: E501

        :param is_read: The is_read of this PortfolioTransaction.  # noqa: E501
        :type: bool
        """

        self._is_read = is_read

    @property
    def is_recurring(self):
        """Gets the is_recurring of this PortfolioTransaction.  # noqa: E501

        is_recurring  # noqa: E501

        :return: The is_recurring of this PortfolioTransaction.  # noqa: E501
        :rtype: bool
        """
        return self._is_recurring

    @is_recurring.setter
    def is_recurring(self, is_recurring):
        """Sets the is_recurring of this PortfolioTransaction.

        is_recurring  # noqa: E501

        :param is_recurring: The is_recurring of this PortfolioTransaction.  # noqa: E501
        :type: bool
        """

        self._is_recurring = is_recurring

    @property
    def location(self):
        """Gets the location of this PortfolioTransaction.  # noqa: E501

        location  # noqa: E501

        :return: The location of this PortfolioTransaction.  # noqa: E501
        :rtype: Location
        """
        return self._location

    @location.setter
    def location(self, location):
        """Sets the location of this PortfolioTransaction.

        location  # noqa: E501

        :param location: The location of this PortfolioTransaction.  # noqa: E501
        :type: Location
        """

        self._location = location

    @property
    def memo(self):
        """Gets the memo of this PortfolioTransaction.  # noqa: E501

        memo  # noqa: E501

        :return: The memo of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._memo

    @memo.setter
    def memo(self, memo):
        """Sets the memo of this PortfolioTransaction.

        memo  # noqa: E501

        :param memo: The memo of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._memo = memo

    @property
    def merchant(self):
        """Gets the merchant of this PortfolioTransaction.  # noqa: E501

        merchant  # noqa: E501

        :return: The merchant of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._merchant

    @merchant.setter
    def merchant(self, merchant):
        """Sets the merchant of this PortfolioTransaction.

        merchant  # noqa: E501

        :param merchant: The merchant of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._merchant = merchant

    @property
    def merchant_category_code(self):
        """Gets the merchant_category_code of this PortfolioTransaction.  # noqa: E501

        merchant_category_code  # noqa: E501

        :return: The merchant_category_code of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._merchant_category_code

    @merchant_category_code.setter
    def merchant_category_code(self, merchant_category_code):
        """Sets the merchant_category_code of this PortfolioTransaction.

        merchant_category_code  # noqa: E501

        :param merchant_category_code: The merchant_category_code of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._merchant_category_code = merchant_category_code

    @property
    def merchant_id(self):
        """Gets the merchant_id of this PortfolioTransaction.  # noqa: E501

        merchantId  # noqa: E501

        :return: The merchant_id of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._merchant_id

    @merchant_id.setter
    def merchant_id(self, merchant_id):
        """Sets the merchant_id of this PortfolioTransaction.

        merchantId  # noqa: E501

        :param merchant_id: The merchant_id of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._merchant_id = merchant_id

    @property
    def metadata(self):
        """Gets the metadata of this PortfolioTransaction.  # noqa: E501

        metadata  # noqa: E501

        :return: The metadata of this PortfolioTransaction.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this PortfolioTransaction.

        metadata  # noqa: E501

        :param metadata: The metadata of this PortfolioTransaction.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def mid(self):
        """Gets the mid of this PortfolioTransaction.  # noqa: E501

        mid  # noqa: E501

        :return: The mid of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._mid

    @mid.setter
    def mid(self, mid):
        """Sets the mid of this PortfolioTransaction.

        mid  # noqa: E501

        :param mid: The mid of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._mid = mid

    @property
    def model_id(self):
        """Gets the model_id of this PortfolioTransaction.  # noqa: E501

        modelId  # noqa: E501

        :return: The model_id of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this PortfolioTransaction.

        modelId  # noqa: E501

        :param model_id: The model_id of this PortfolioTransaction.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and model_id is None:
            raise ValueError("Invalid value for `model_id`, must not be `None`")  # noqa: E501

        self._model_id = model_id

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this PortfolioTransaction.  # noqa: E501

        portfolioId  # noqa: E501

        :return: The portfolio_id of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this PortfolioTransaction.

        portfolioId  # noqa: E501

        :param portfolio_id: The portfolio_id of this PortfolioTransaction.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and portfolio_id is None:
            raise ValueError("Invalid value for `portfolio_id`, must not be `None`")  # noqa: E501

        self._portfolio_id = portfolio_id

    @property
    def price(self):
        """Gets the price of this PortfolioTransaction.  # noqa: E501

        price  # noqa: E501

        :return: The price of this PortfolioTransaction.  # noqa: E501
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this PortfolioTransaction.

        price  # noqa: E501

        :param price: The price of this PortfolioTransaction.  # noqa: E501
        :type: float
        """

        self._price = price

    @property
    def quantity(self):
        """Gets the quantity of this PortfolioTransaction.  # noqa: E501

        quantity  # noqa: E501

        :return: The quantity of this PortfolioTransaction.  # noqa: E501
        :rtype: float
        """
        return self._quantity

    @quantity.setter
    def quantity(self, quantity):
        """Sets the quantity of this PortfolioTransaction.

        quantity  # noqa: E501

        :param quantity: The quantity of this PortfolioTransaction.  # noqa: E501
        :type: float
        """

        self._quantity = quantity

    @property
    def secondary_id(self):
        """Gets the secondary_id of this PortfolioTransaction.  # noqa: E501


        :return: The secondary_id of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this PortfolioTransaction.


        :param secondary_id: The secondary_id of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def security_id(self):
        """Gets the security_id of this PortfolioTransaction.  # noqa: E501

        securityId  # noqa: E501

        :return: The security_id of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._security_id

    @security_id.setter
    def security_id(self, security_id):
        """Sets the security_id of this PortfolioTransaction.

        securityId  # noqa: E501

        :param security_id: The security_id of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._security_id = security_id

    @property
    def status(self):
        """Gets the status of this PortfolioTransaction.  # noqa: E501

        status  # noqa: E501

        :return: The status of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this PortfolioTransaction.

        status  # noqa: E501

        :param status: The status of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def subcategory(self):
        """Gets the subcategory of this PortfolioTransaction.  # noqa: E501

        subcategory  # noqa: E501

        :return: The subcategory of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._subcategory

    @subcategory.setter
    def subcategory(self, subcategory):
        """Sets the subcategory of this PortfolioTransaction.

        subcategory  # noqa: E501

        :param subcategory: The subcategory of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._subcategory = subcategory

    @property
    def transaction_category_id(self):
        """Gets the transaction_category_id of this PortfolioTransaction.  # noqa: E501

        transactionCategoryId  # noqa: E501

        :return: The transaction_category_id of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._transaction_category_id

    @transaction_category_id.setter
    def transaction_category_id(self, transaction_category_id):
        """Sets the transaction_category_id of this PortfolioTransaction.

        transactionCategoryId  # noqa: E501

        :param transaction_category_id: The transaction_category_id of this PortfolioTransaction.  # noqa: E501
        :type: str
        """

        self._transaction_category_id = transaction_category_id

    @property
    def transaction_code_id(self):
        """Gets the transaction_code_id of this PortfolioTransaction.  # noqa: E501

        alertId  # noqa: E501

        :return: The transaction_code_id of this PortfolioTransaction.  # noqa: E501
        :rtype: str
        """
        return self._transaction_code_id

    @transaction_code_id.setter
    def transaction_code_id(self, transaction_code_id):
        """Sets the transaction_code_id of this PortfolioTransaction.

        alertId  # noqa: E501

        :param transaction_code_id: The transaction_code_id of this PortfolioTransaction.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and transaction_code_id is None:
            raise ValueError("Invalid value for `transaction_code_id`, must not be `None`")  # noqa: E501

        self._transaction_code_id = transaction_code_id

    @property
    def update_date(self):
        """Gets the update_date of this PortfolioTransaction.  # noqa: E501


        :return: The update_date of this PortfolioTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this PortfolioTransaction.


        :param update_date: The update_date of this PortfolioTransaction.  # noqa: E501
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
        if issubclass(PortfolioTransaction, dict):
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
        if not isinstance(other, PortfolioTransaction):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PortfolioTransaction):
            return True

        return self.to_dict() != other.to_dict()
