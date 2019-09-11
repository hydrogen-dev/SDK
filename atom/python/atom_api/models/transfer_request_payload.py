# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class TransferRequestPayload(object):
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
        'account_holder': 'str',
        'account_number': 'str',
        'account_type_id': 'str',
        'firm_name': 'str',
        'transfer_all_cash': 'bool',
        'amount': 'float',
        'comment': 'str',
        'dtc_number': 'str',
        'roth_five_year': 'int',
        'status': 'str',
        'transfer_type': 'str',
        'secondary_id': 'SecondaryId'
    }

    attribute_map = {
        'account_id': 'account_id',
        'account_holder': 'account_holder',
        'account_number': 'account_number',
        'account_type_id': 'account_type_id',
        'firm_name': 'firm_name',
        'transfer_all_cash': 'transfer_all_cash',
        'amount': 'amount',
        'comment': 'comment',
        'dtc_number': 'dtc_number',
        'roth_five_year': 'roth_five_year',
        'status': 'status',
        'transfer_type': 'transfer_type',
        'secondary_id': 'secondary_id'
    }

    def __init__(self, account_id=None, account_holder=None, account_number=None, account_type_id=None, firm_name=None, transfer_all_cash=None, amount=None, comment=None, dtc_number=None, roth_five_year=None, status=None, transfer_type=None, secondary_id=None):  # noqa: E501
        """TransferRequestPayload - a model defined in Swagger"""  # noqa: E501

        self._account_id = None
        self._account_holder = None
        self._account_number = None
        self._account_type_id = None
        self._firm_name = None
        self._transfer_all_cash = None
        self._amount = None
        self._comment = None
        self._dtc_number = None
        self._roth_five_year = None
        self._status = None
        self._transfer_type = None
        self._secondary_id = None
        self.discriminator = None

        self.account_id = account_id
        self.account_holder = account_holder
        self.account_number = account_number
        self.account_type_id = account_type_id
        self.firm_name = firm_name
        self.transfer_all_cash = transfer_all_cash
        if amount is not None:
            self.amount = amount
        if comment is not None:
            self.comment = comment
        if dtc_number is not None:
            self.dtc_number = dtc_number
        if roth_five_year is not None:
            self.roth_five_year = roth_five_year
        if status is not None:
            self.status = status
        if transfer_type is not None:
            self.transfer_type = transfer_type
        if secondary_id is not None:
            self.secondary_id = secondary_id

    @property
    def account_id(self):
        """Gets the account_id of this TransferRequestPayload.  # noqa: E501

        The ID of the account to which the transfer belongs  # noqa: E501

        :return: The account_id of this TransferRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this TransferRequestPayload.

        The ID of the account to which the transfer belongs  # noqa: E501

        :param account_id: The account_id of this TransferRequestPayload.  # noqa: E501
        :type: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

    @property
    def account_holder(self):
        """Gets the account_holder of this TransferRequestPayload.  # noqa: E501

        Name of the individual that is the owner of the external account  # noqa: E501

        :return: The account_holder of this TransferRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._account_holder

    @account_holder.setter
    def account_holder(self, account_holder):
        """Sets the account_holder of this TransferRequestPayload.

        Name of the individual that is the owner of the external account  # noqa: E501

        :param account_holder: The account_holder of this TransferRequestPayload.  # noqa: E501
        :type: str
        """
        if account_holder is None:
            raise ValueError("Invalid value for `account_holder`, must not be `None`")  # noqa: E501

        self._account_holder = account_holder

    @property
    def account_number(self):
        """Gets the account_number of this TransferRequestPayload.  # noqa: E501

        Account number for the external account that is the source of the funds  # noqa: E501

        :return: The account_number of this TransferRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._account_number

    @account_number.setter
    def account_number(self, account_number):
        """Sets the account_number of this TransferRequestPayload.

        Account number for the external account that is the source of the funds  # noqa: E501

        :param account_number: The account_number of this TransferRequestPayload.  # noqa: E501
        :type: str
        """
        if account_number is None:
            raise ValueError("Invalid value for `account_number`, must not be `None`")  # noqa: E501

        self._account_number = account_number

    @property
    def account_type_id(self):
        """Gets the account_type_id of this TransferRequestPayload.  # noqa: E501

        The ID for the type of the account on your platform  # noqa: E501

        :return: The account_type_id of this TransferRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._account_type_id

    @account_type_id.setter
    def account_type_id(self, account_type_id):
        """Sets the account_type_id of this TransferRequestPayload.

        The ID for the type of the account on your platform  # noqa: E501

        :param account_type_id: The account_type_id of this TransferRequestPayload.  # noqa: E501
        :type: str
        """
        if account_type_id is None:
            raise ValueError("Invalid value for `account_type_id`, must not be `None`")  # noqa: E501

        self._account_type_id = account_type_id

    @property
    def firm_name(self):
        """Gets the firm_name of this TransferRequestPayload.  # noqa: E501

        Name of the firm that previously held or holds the external account  # noqa: E501

        :return: The firm_name of this TransferRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._firm_name

    @firm_name.setter
    def firm_name(self, firm_name):
        """Sets the firm_name of this TransferRequestPayload.

        Name of the firm that previously held or holds the external account  # noqa: E501

        :param firm_name: The firm_name of this TransferRequestPayload.  # noqa: E501
        :type: str
        """
        if firm_name is None:
            raise ValueError("Invalid value for `firm_name`, must not be `None`")  # noqa: E501

        self._firm_name = firm_name

    @property
    def transfer_all_cash(self):
        """Gets the transfer_all_cash of this TransferRequestPayload.  # noqa: E501

        Indicator if the external account should be entirely converted to cash to be transferred.  # noqa: E501

        :return: The transfer_all_cash of this TransferRequestPayload.  # noqa: E501
        :rtype: bool
        """
        return self._transfer_all_cash

    @transfer_all_cash.setter
    def transfer_all_cash(self, transfer_all_cash):
        """Sets the transfer_all_cash of this TransferRequestPayload.

        Indicator if the external account should be entirely converted to cash to be transferred.  # noqa: E501

        :param transfer_all_cash: The transfer_all_cash of this TransferRequestPayload.  # noqa: E501
        :type: bool
        """
        if transfer_all_cash is None:
            raise ValueError("Invalid value for `transfer_all_cash`, must not be `None`")  # noqa: E501

        self._transfer_all_cash = transfer_all_cash

    @property
    def amount(self):
        """Gets the amount of this TransferRequestPayload.  # noqa: E501

        Amount that is transferred  # noqa: E501

        :return: The amount of this TransferRequestPayload.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this TransferRequestPayload.

        Amount that is transferred  # noqa: E501

        :param amount: The amount of this TransferRequestPayload.  # noqa: E501
        :type: float
        """

        self._amount = amount

    @property
    def comment(self):
        """Gets the comment of this TransferRequestPayload.  # noqa: E501

        Comment for the transfer such as “Funded”  # noqa: E501

        :return: The comment of this TransferRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """Sets the comment of this TransferRequestPayload.

        Comment for the transfer such as “Funded”  # noqa: E501

        :param comment: The comment of this TransferRequestPayload.  # noqa: E501
        :type: str
        """

        self._comment = comment

    @property
    def dtc_number(self):
        """Gets the dtc_number of this TransferRequestPayload.  # noqa: E501

        Number of the Deposit Trust Company (DTC)’s that held or holds the external account usually in the case of an Individual Retirement Account (IRA) in the United States  # noqa: E501

        :return: The dtc_number of this TransferRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._dtc_number

    @dtc_number.setter
    def dtc_number(self, dtc_number):
        """Sets the dtc_number of this TransferRequestPayload.

        Number of the Deposit Trust Company (DTC)’s that held or holds the external account usually in the case of an Individual Retirement Account (IRA) in the United States  # noqa: E501

        :param dtc_number: The dtc_number of this TransferRequestPayload.  # noqa: E501
        :type: str
        """

        self._dtc_number = dtc_number

    @property
    def roth_five_year(self):
        """Gets the roth_five_year of this TransferRequestPayload.  # noqa: E501

        In the case that the account is a United States Roth IRA account, the year it was opened (e.g. 2010)  # noqa: E501

        :return: The roth_five_year of this TransferRequestPayload.  # noqa: E501
        :rtype: int
        """
        return self._roth_five_year

    @roth_five_year.setter
    def roth_five_year(self, roth_five_year):
        """Sets the roth_five_year of this TransferRequestPayload.

        In the case that the account is a United States Roth IRA account, the year it was opened (e.g. 2010)  # noqa: E501

        :param roth_five_year: The roth_five_year of this TransferRequestPayload.  # noqa: E501
        :type: int
        """

        self._roth_five_year = roth_five_year

    @property
    def status(self):
        """Gets the status of this TransferRequestPayload.  # noqa: E501

        Status of the transfer such as “Pending”  # noqa: E501

        :return: The status of this TransferRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this TransferRequestPayload.

        Status of the transfer such as “Pending”  # noqa: E501

        :param status: The status of this TransferRequestPayload.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def transfer_type(self):
        """Gets the transfer_type of this TransferRequestPayload.  # noqa: E501

        Type of transaction being made such as “wire” or “check”  # noqa: E501

        :return: The transfer_type of this TransferRequestPayload.  # noqa: E501
        :rtype: str
        """
        return self._transfer_type

    @transfer_type.setter
    def transfer_type(self, transfer_type):
        """Sets the transfer_type of this TransferRequestPayload.

        Type of transaction being made such as “wire” or “check”  # noqa: E501

        :param transfer_type: The transfer_type of this TransferRequestPayload.  # noqa: E501
        :type: str
        """

        self._transfer_type = transfer_type

    @property
    def secondary_id(self):
        """Gets the secondary_id of this TransferRequestPayload.  # noqa: E501


        :return: The secondary_id of this TransferRequestPayload.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this TransferRequestPayload.


        :param secondary_id: The secondary_id of this TransferRequestPayload.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

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
        if issubclass(TransferRequestPayload, dict):
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
        if not isinstance(other, TransferRequestPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other