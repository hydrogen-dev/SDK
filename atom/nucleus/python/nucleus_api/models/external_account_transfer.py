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


class ExternalAccountTransfer(object):
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
        'account_holder': 'str',
        'account_id': 'str',
        'account_number': 'str',
        'account_type_id': 'str',
        'amount': 'float',
        'comment': 'str',
        'create_date': 'datetime',
        'currency_code': 'str',
        'dtc_number': 'str',
        'firm_name': 'str',
        'id': 'str',
        'metadata': 'dict(str, str)',
        'received_date': 'datetime',
        'roth_five_year': 'int',
        'secondary_id': 'str',
        'status': 'str',
        'status_time_stamp': 'datetime',
        'transfer_all_cash': 'bool',
        'transfer_date': 'date',
        'transfer_type': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'account_holder': 'account_holder',
        'account_id': 'account_id',
        'account_number': 'account_number',
        'account_type_id': 'account_type_id',
        'amount': 'amount',
        'comment': 'comment',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        'dtc_number': 'dtc_number',
        'firm_name': 'firm_name',
        'id': 'id',
        'metadata': 'metadata',
        'received_date': 'received_date',
        'roth_five_year': 'roth_five_year',
        'secondary_id': 'secondary_id',
        'status': 'status',
        'status_time_stamp': 'status_time_stamp',
        'transfer_all_cash': 'transfer_all_cash',
        'transfer_date': 'transfer_date',
        'transfer_type': 'transfer_type',
        'update_date': 'update_date'
    }

    def __init__(self, account_holder=None, account_id=None, account_number=None, account_type_id=None, amount=None, comment=None, create_date=None, currency_code=None, dtc_number=None, firm_name=None, id=None, metadata=None, received_date=None, roth_five_year=None, secondary_id=None, status=None, status_time_stamp=None, transfer_all_cash=None, transfer_date=None, transfer_type=None, update_date=None, _configuration=None):  # noqa: E501
        """ExternalAccountTransfer - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._account_holder = None
        self._account_id = None
        self._account_number = None
        self._account_type_id = None
        self._amount = None
        self._comment = None
        self._create_date = None
        self._currency_code = None
        self._dtc_number = None
        self._firm_name = None
        self._id = None
        self._metadata = None
        self._received_date = None
        self._roth_five_year = None
        self._secondary_id = None
        self._status = None
        self._status_time_stamp = None
        self._transfer_all_cash = None
        self._transfer_date = None
        self._transfer_type = None
        self._update_date = None
        self.discriminator = None

        self.account_holder = account_holder
        self.account_id = account_id
        self.account_number = account_number
        self.account_type_id = account_type_id
        if amount is not None:
            self.amount = amount
        if comment is not None:
            self.comment = comment
        if create_date is not None:
            self.create_date = create_date
        if currency_code is not None:
            self.currency_code = currency_code
        if dtc_number is not None:
            self.dtc_number = dtc_number
        self.firm_name = firm_name
        if id is not None:
            self.id = id
        if metadata is not None:
            self.metadata = metadata
        if received_date is not None:
            self.received_date = received_date
        if roth_five_year is not None:
            self.roth_five_year = roth_five_year
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if status is not None:
            self.status = status
        if status_time_stamp is not None:
            self.status_time_stamp = status_time_stamp
        self.transfer_all_cash = transfer_all_cash
        self.transfer_date = transfer_date
        if transfer_type is not None:
            self.transfer_type = transfer_type
        if update_date is not None:
            self.update_date = update_date

    @property
    def account_holder(self):
        """Gets the account_holder of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer accountHolder  # noqa: E501

        :return: The account_holder of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._account_holder

    @account_holder.setter
    def account_holder(self, account_holder):
        """Sets the account_holder of this ExternalAccountTransfer.

        External Account Transfer accountHolder  # noqa: E501

        :param account_holder: The account_holder of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and account_holder is None:
            raise ValueError("Invalid value for `account_holder`, must not be `None`")  # noqa: E501

        self._account_holder = account_holder

    @property
    def account_id(self):
        """Gets the account_id of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer account id  # noqa: E501

        :return: The account_id of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this ExternalAccountTransfer.

        External Account Transfer account id  # noqa: E501

        :param account_id: The account_id of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

    @property
    def account_number(self):
        """Gets the account_number of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer account number  # noqa: E501

        :return: The account_number of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._account_number

    @account_number.setter
    def account_number(self, account_number):
        """Sets the account_number of this ExternalAccountTransfer.

        External Account Transfer account number  # noqa: E501

        :param account_number: The account_number of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and account_number is None:
            raise ValueError("Invalid value for `account_number`, must not be `None`")  # noqa: E501

        self._account_number = account_number

    @property
    def account_type_id(self):
        """Gets the account_type_id of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer account type id  # noqa: E501

        :return: The account_type_id of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._account_type_id

    @account_type_id.setter
    def account_type_id(self, account_type_id):
        """Sets the account_type_id of this ExternalAccountTransfer.

        External Account Transfer account type id  # noqa: E501

        :param account_type_id: The account_type_id of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and account_type_id is None:
            raise ValueError("Invalid value for `account_type_id`, must not be `None`")  # noqa: E501

        self._account_type_id = account_type_id

    @property
    def amount(self):
        """Gets the amount of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer amount  # noqa: E501

        :return: The amount of this ExternalAccountTransfer.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this ExternalAccountTransfer.

        External Account Transfer amount  # noqa: E501

        :param amount: The amount of this ExternalAccountTransfer.  # noqa: E501
        :type: float
        """

        self._amount = amount

    @property
    def comment(self):
        """Gets the comment of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer comment  # noqa: E501

        :return: The comment of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """Sets the comment of this ExternalAccountTransfer.

        External Account Transfer comment  # noqa: E501

        :param comment: The comment of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """

        self._comment = comment

    @property
    def create_date(self):
        """Gets the create_date of this ExternalAccountTransfer.  # noqa: E501


        :return: The create_date of this ExternalAccountTransfer.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this ExternalAccountTransfer.


        :param create_date: The create_date of this ExternalAccountTransfer.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this ExternalAccountTransfer.  # noqa: E501

        currencyCode  # noqa: E501

        :return: The currency_code of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this ExternalAccountTransfer.

        currencyCode  # noqa: E501

        :param currency_code: The currency_code of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def dtc_number(self):
        """Gets the dtc_number of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer dtcNumber  # noqa: E501

        :return: The dtc_number of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._dtc_number

    @dtc_number.setter
    def dtc_number(self, dtc_number):
        """Sets the dtc_number of this ExternalAccountTransfer.

        External Account Transfer dtcNumber  # noqa: E501

        :param dtc_number: The dtc_number of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """

        self._dtc_number = dtc_number

    @property
    def firm_name(self):
        """Gets the firm_name of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer firm name  # noqa: E501

        :return: The firm_name of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._firm_name

    @firm_name.setter
    def firm_name(self, firm_name):
        """Sets the firm_name of this ExternalAccountTransfer.

        External Account Transfer firm name  # noqa: E501

        :param firm_name: The firm_name of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and firm_name is None:
            raise ValueError("Invalid value for `firm_name`, must not be `None`")  # noqa: E501

        self._firm_name = firm_name

    @property
    def id(self):
        """Gets the id of this ExternalAccountTransfer.  # noqa: E501


        :return: The id of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ExternalAccountTransfer.


        :param id: The id of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def metadata(self):
        """Gets the metadata of this ExternalAccountTransfer.  # noqa: E501


        :return: The metadata of this ExternalAccountTransfer.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this ExternalAccountTransfer.


        :param metadata: The metadata of this ExternalAccountTransfer.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def received_date(self):
        """Gets the received_date of this ExternalAccountTransfer.  # noqa: E501


        :return: The received_date of this ExternalAccountTransfer.  # noqa: E501
        :rtype: datetime
        """
        return self._received_date

    @received_date.setter
    def received_date(self, received_date):
        """Sets the received_date of this ExternalAccountTransfer.


        :param received_date: The received_date of this ExternalAccountTransfer.  # noqa: E501
        :type: datetime
        """

        self._received_date = received_date

    @property
    def roth_five_year(self):
        """Gets the roth_five_year of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer roth five year  # noqa: E501

        :return: The roth_five_year of this ExternalAccountTransfer.  # noqa: E501
        :rtype: int
        """
        return self._roth_five_year

    @roth_five_year.setter
    def roth_five_year(self, roth_five_year):
        """Sets the roth_five_year of this ExternalAccountTransfer.

        External Account Transfer roth five year  # noqa: E501

        :param roth_five_year: The roth_five_year of this ExternalAccountTransfer.  # noqa: E501
        :type: int
        """

        self._roth_five_year = roth_five_year

    @property
    def secondary_id(self):
        """Gets the secondary_id of this ExternalAccountTransfer.  # noqa: E501


        :return: The secondary_id of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this ExternalAccountTransfer.


        :param secondary_id: The secondary_id of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def status(self):
        """Gets the status of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer status  # noqa: E501

        :return: The status of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this ExternalAccountTransfer.

        External Account Transfer status  # noqa: E501

        :param status: The status of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def status_time_stamp(self):
        """Gets the status_time_stamp of this ExternalAccountTransfer.  # noqa: E501


        :return: The status_time_stamp of this ExternalAccountTransfer.  # noqa: E501
        :rtype: datetime
        """
        return self._status_time_stamp

    @status_time_stamp.setter
    def status_time_stamp(self, status_time_stamp):
        """Sets the status_time_stamp of this ExternalAccountTransfer.


        :param status_time_stamp: The status_time_stamp of this ExternalAccountTransfer.  # noqa: E501
        :type: datetime
        """

        self._status_time_stamp = status_time_stamp

    @property
    def transfer_all_cash(self):
        """Gets the transfer_all_cash of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer transfer all cash  # noqa: E501

        :return: The transfer_all_cash of this ExternalAccountTransfer.  # noqa: E501
        :rtype: bool
        """
        return self._transfer_all_cash

    @transfer_all_cash.setter
    def transfer_all_cash(self, transfer_all_cash):
        """Sets the transfer_all_cash of this ExternalAccountTransfer.

        External Account Transfer transfer all cash  # noqa: E501

        :param transfer_all_cash: The transfer_all_cash of this ExternalAccountTransfer.  # noqa: E501
        :type: bool
        """
        if self._configuration.client_side_validation and transfer_all_cash is None:
            raise ValueError("Invalid value for `transfer_all_cash`, must not be `None`")  # noqa: E501

        self._transfer_all_cash = transfer_all_cash

    @property
    def transfer_date(self):
        """Gets the transfer_date of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer account transfer date  # noqa: E501

        :return: The transfer_date of this ExternalAccountTransfer.  # noqa: E501
        :rtype: date
        """
        return self._transfer_date

    @transfer_date.setter
    def transfer_date(self, transfer_date):
        """Sets the transfer_date of this ExternalAccountTransfer.

        External Account Transfer account transfer date  # noqa: E501

        :param transfer_date: The transfer_date of this ExternalAccountTransfer.  # noqa: E501
        :type: date
        """
        if self._configuration.client_side_validation and transfer_date is None:
            raise ValueError("Invalid value for `transfer_date`, must not be `None`")  # noqa: E501

        self._transfer_date = transfer_date

    @property
    def transfer_type(self):
        """Gets the transfer_type of this ExternalAccountTransfer.  # noqa: E501

        External Account Transfer transfer type  # noqa: E501

        :return: The transfer_type of this ExternalAccountTransfer.  # noqa: E501
        :rtype: str
        """
        return self._transfer_type

    @transfer_type.setter
    def transfer_type(self, transfer_type):
        """Sets the transfer_type of this ExternalAccountTransfer.

        External Account Transfer transfer type  # noqa: E501

        :param transfer_type: The transfer_type of this ExternalAccountTransfer.  # noqa: E501
        :type: str
        """

        self._transfer_type = transfer_type

    @property
    def update_date(self):
        """Gets the update_date of this ExternalAccountTransfer.  # noqa: E501


        :return: The update_date of this ExternalAccountTransfer.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this ExternalAccountTransfer.


        :param update_date: The update_date of this ExternalAccountTransfer.  # noqa: E501
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
        if issubclass(ExternalAccountTransfer, dict):
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
        if not isinstance(other, ExternalAccountTransfer):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ExternalAccountTransfer):
            return True

        return self.to_dict() != other.to_dict()
