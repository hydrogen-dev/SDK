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


class AggregationAccountTransaction(object):
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
        'aggregation_account_id': 'str',
        'bank_credit': 'BankCredit',
        'cash': 'Cash',
        'create_date': 'datetime',
        'currency_code': 'str',
        'id': 'str',
        'investment': 'Investment',
        'is_excluded_analysis': 'bool',
        'is_fee': 'bool',
        'is_recurring': 'bool',
        'is_transfer': 'bool',
        'metadata': 'dict(str, str)',
        'secondary_id': 'str',
        'status': 'str',
        'transaction_date': 'datetime',
        'update_date': 'datetime'
    }

    attribute_map = {
        'aggregation_account_id': 'aggregation_account_id',
        'bank_credit': 'bank_credit',
        'cash': 'cash',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        'id': 'id',
        'investment': 'investment',
        'is_excluded_analysis': 'is_excluded_analysis',
        'is_fee': 'is_fee',
        'is_recurring': 'is_recurring',
        'is_transfer': 'is_transfer',
        'metadata': 'metadata',
        'secondary_id': 'secondary_id',
        'status': 'status',
        'transaction_date': 'transaction_date',
        'update_date': 'update_date'
    }

    def __init__(self, aggregation_account_id=None, bank_credit=None, cash=None, create_date=None, currency_code=None, id=None, investment=None, is_excluded_analysis=None, is_fee=None, is_recurring=None, is_transfer=None, metadata=None, secondary_id=None, status=None, transaction_date=None, update_date=None, _configuration=None):  # noqa: E501
        """AggregationAccountTransaction - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._aggregation_account_id = None
        self._bank_credit = None
        self._cash = None
        self._create_date = None
        self._currency_code = None
        self._id = None
        self._investment = None
        self._is_excluded_analysis = None
        self._is_fee = None
        self._is_recurring = None
        self._is_transfer = None
        self._metadata = None
        self._secondary_id = None
        self._status = None
        self._transaction_date = None
        self._update_date = None
        self.discriminator = None

        if aggregation_account_id is not None:
            self.aggregation_account_id = aggregation_account_id
        if bank_credit is not None:
            self.bank_credit = bank_credit
        if cash is not None:
            self.cash = cash
        if create_date is not None:
            self.create_date = create_date
        self.currency_code = currency_code
        if id is not None:
            self.id = id
        if investment is not None:
            self.investment = investment
        if is_excluded_analysis is not None:
            self.is_excluded_analysis = is_excluded_analysis
        if is_fee is not None:
            self.is_fee = is_fee
        if is_recurring is not None:
            self.is_recurring = is_recurring
        if is_transfer is not None:
            self.is_transfer = is_transfer
        if metadata is not None:
            self.metadata = metadata
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if status is not None:
            self.status = status
        self.transaction_date = transaction_date
        if update_date is not None:
            self.update_date = update_date

    @property
    def aggregation_account_id(self):
        """Gets the aggregation_account_id of this AggregationAccountTransaction.  # noqa: E501

        aggregationAccountId  # noqa: E501

        :return: The aggregation_account_id of this AggregationAccountTransaction.  # noqa: E501
        :rtype: str
        """
        return self._aggregation_account_id

    @aggregation_account_id.setter
    def aggregation_account_id(self, aggregation_account_id):
        """Sets the aggregation_account_id of this AggregationAccountTransaction.

        aggregationAccountId  # noqa: E501

        :param aggregation_account_id: The aggregation_account_id of this AggregationAccountTransaction.  # noqa: E501
        :type: str
        """

        self._aggregation_account_id = aggregation_account_id

    @property
    def bank_credit(self):
        """Gets the bank_credit of this AggregationAccountTransaction.  # noqa: E501


        :return: The bank_credit of this AggregationAccountTransaction.  # noqa: E501
        :rtype: BankCredit
        """
        return self._bank_credit

    @bank_credit.setter
    def bank_credit(self, bank_credit):
        """Sets the bank_credit of this AggregationAccountTransaction.


        :param bank_credit: The bank_credit of this AggregationAccountTransaction.  # noqa: E501
        :type: BankCredit
        """

        self._bank_credit = bank_credit

    @property
    def cash(self):
        """Gets the cash of this AggregationAccountTransaction.  # noqa: E501


        :return: The cash of this AggregationAccountTransaction.  # noqa: E501
        :rtype: Cash
        """
        return self._cash

    @cash.setter
    def cash(self, cash):
        """Sets the cash of this AggregationAccountTransaction.


        :param cash: The cash of this AggregationAccountTransaction.  # noqa: E501
        :type: Cash
        """

        self._cash = cash

    @property
    def create_date(self):
        """Gets the create_date of this AggregationAccountTransaction.  # noqa: E501


        :return: The create_date of this AggregationAccountTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this AggregationAccountTransaction.


        :param create_date: The create_date of this AggregationAccountTransaction.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this AggregationAccountTransaction.  # noqa: E501

        currencyCode  # noqa: E501

        :return: The currency_code of this AggregationAccountTransaction.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this AggregationAccountTransaction.

        currencyCode  # noqa: E501

        :param currency_code: The currency_code of this AggregationAccountTransaction.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and currency_code is None:
            raise ValueError("Invalid value for `currency_code`, must not be `None`")  # noqa: E501

        self._currency_code = currency_code

    @property
    def id(self):
        """Gets the id of this AggregationAccountTransaction.  # noqa: E501


        :return: The id of this AggregationAccountTransaction.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this AggregationAccountTransaction.


        :param id: The id of this AggregationAccountTransaction.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def investment(self):
        """Gets the investment of this AggregationAccountTransaction.  # noqa: E501


        :return: The investment of this AggregationAccountTransaction.  # noqa: E501
        :rtype: Investment
        """
        return self._investment

    @investment.setter
    def investment(self, investment):
        """Sets the investment of this AggregationAccountTransaction.


        :param investment: The investment of this AggregationAccountTransaction.  # noqa: E501
        :type: Investment
        """

        self._investment = investment

    @property
    def is_excluded_analysis(self):
        """Gets the is_excluded_analysis of this AggregationAccountTransaction.  # noqa: E501


        :return: The is_excluded_analysis of this AggregationAccountTransaction.  # noqa: E501
        :rtype: bool
        """
        return self._is_excluded_analysis

    @is_excluded_analysis.setter
    def is_excluded_analysis(self, is_excluded_analysis):
        """Sets the is_excluded_analysis of this AggregationAccountTransaction.


        :param is_excluded_analysis: The is_excluded_analysis of this AggregationAccountTransaction.  # noqa: E501
        :type: bool
        """

        self._is_excluded_analysis = is_excluded_analysis

    @property
    def is_fee(self):
        """Gets the is_fee of this AggregationAccountTransaction.  # noqa: E501


        :return: The is_fee of this AggregationAccountTransaction.  # noqa: E501
        :rtype: bool
        """
        return self._is_fee

    @is_fee.setter
    def is_fee(self, is_fee):
        """Sets the is_fee of this AggregationAccountTransaction.


        :param is_fee: The is_fee of this AggregationAccountTransaction.  # noqa: E501
        :type: bool
        """

        self._is_fee = is_fee

    @property
    def is_recurring(self):
        """Gets the is_recurring of this AggregationAccountTransaction.  # noqa: E501


        :return: The is_recurring of this AggregationAccountTransaction.  # noqa: E501
        :rtype: bool
        """
        return self._is_recurring

    @is_recurring.setter
    def is_recurring(self, is_recurring):
        """Sets the is_recurring of this AggregationAccountTransaction.


        :param is_recurring: The is_recurring of this AggregationAccountTransaction.  # noqa: E501
        :type: bool
        """

        self._is_recurring = is_recurring

    @property
    def is_transfer(self):
        """Gets the is_transfer of this AggregationAccountTransaction.  # noqa: E501


        :return: The is_transfer of this AggregationAccountTransaction.  # noqa: E501
        :rtype: bool
        """
        return self._is_transfer

    @is_transfer.setter
    def is_transfer(self, is_transfer):
        """Sets the is_transfer of this AggregationAccountTransaction.


        :param is_transfer: The is_transfer of this AggregationAccountTransaction.  # noqa: E501
        :type: bool
        """

        self._is_transfer = is_transfer

    @property
    def metadata(self):
        """Gets the metadata of this AggregationAccountTransaction.  # noqa: E501


        :return: The metadata of this AggregationAccountTransaction.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this AggregationAccountTransaction.


        :param metadata: The metadata of this AggregationAccountTransaction.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def secondary_id(self):
        """Gets the secondary_id of this AggregationAccountTransaction.  # noqa: E501


        :return: The secondary_id of this AggregationAccountTransaction.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this AggregationAccountTransaction.


        :param secondary_id: The secondary_id of this AggregationAccountTransaction.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def status(self):
        """Gets the status of this AggregationAccountTransaction.  # noqa: E501

        status  # noqa: E501

        :return: The status of this AggregationAccountTransaction.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this AggregationAccountTransaction.

        status  # noqa: E501

        :param status: The status of this AggregationAccountTransaction.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def transaction_date(self):
        """Gets the transaction_date of this AggregationAccountTransaction.  # noqa: E501

        transactionDate  # noqa: E501

        :return: The transaction_date of this AggregationAccountTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self._transaction_date

    @transaction_date.setter
    def transaction_date(self, transaction_date):
        """Sets the transaction_date of this AggregationAccountTransaction.

        transactionDate  # noqa: E501

        :param transaction_date: The transaction_date of this AggregationAccountTransaction.  # noqa: E501
        :type: datetime
        """
        if self._configuration.client_side_validation and transaction_date is None:
            raise ValueError("Invalid value for `transaction_date`, must not be `None`")  # noqa: E501

        self._transaction_date = transaction_date

    @property
    def update_date(self):
        """Gets the update_date of this AggregationAccountTransaction.  # noqa: E501


        :return: The update_date of this AggregationAccountTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this AggregationAccountTransaction.


        :param update_date: The update_date of this AggregationAccountTransaction.  # noqa: E501
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
        if issubclass(AggregationAccountTransaction, dict):
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
        if not isinstance(other, AggregationAccountTransaction):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AggregationAccountTransaction):
            return True

        return self.to_dict() != other.to_dict()
