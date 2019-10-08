# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.0.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class AllocationTransactionResponseContent(object):
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
        'id': 'str',
        'shares': 'float',
        'price': 'float',
        '_date': 'date',
        'model_id': 'str',
        'security_id': 'str',
        'transaction_code_id': 'str',
        'secondary_id': 'str',
        'create_date': 'date',
        'update_date': 'str'
    }

    attribute_map = {
        'id': 'id',
        'shares': 'shares',
        'price': 'price',
        '_date': 'date',
        'model_id': 'model_id',
        'security_id': 'security_id',
        'transaction_code_id': 'transaction_code_id',
        'secondary_id': 'secondary_id',
        'create_date': 'create_date',
        'update_date': 'update_date'
    }

    def __init__(self, id=None, shares=None, price=None, _date=None, model_id=None, security_id=None, transaction_code_id=None, secondary_id=None, create_date=None, update_date=None):  # noqa: E501
        """AllocationTransactionResponseContent - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._shares = None
        self._price = None
        self.__date = None
        self._model_id = None
        self._security_id = None
        self._transaction_code_id = None
        self._secondary_id = None
        self._create_date = None
        self._update_date = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if shares is not None:
            self.shares = shares
        if price is not None:
            self.price = price
        if _date is not None:
            self._date = _date
        if model_id is not None:
            self.model_id = model_id
        if security_id is not None:
            self.security_id = security_id
        if transaction_code_id is not None:
            self.transaction_code_id = transaction_code_id
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if create_date is not None:
            self.create_date = create_date
        if update_date is not None:
            self.update_date = update_date

    @property
    def id(self):
        """Gets the id of this AllocationTransactionResponseContent.  # noqa: E501

        The ID of the allocation transaction record  # noqa: E501

        :return: The id of this AllocationTransactionResponseContent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this AllocationTransactionResponseContent.

        The ID of the allocation transaction record  # noqa: E501

        :param id: The id of this AllocationTransactionResponseContent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def shares(self):
        """Gets the shares of this AllocationTransactionResponseContent.  # noqa: E501

        Number of shares of the security purchased as part of the transaction  # noqa: E501

        :return: The shares of this AllocationTransactionResponseContent.  # noqa: E501
        :rtype: float
        """
        return self._shares

    @shares.setter
    def shares(self, shares):
        """Sets the shares of this AllocationTransactionResponseContent.

        Number of shares of the security purchased as part of the transaction  # noqa: E501

        :param shares: The shares of this AllocationTransactionResponseContent.  # noqa: E501
        :type: float
        """

        self._shares = shares

    @property
    def price(self):
        """Gets the price of this AllocationTransactionResponseContent.  # noqa: E501

        Security price at which the shares were purchased as part of the transaction  # noqa: E501

        :return: The price of this AllocationTransactionResponseContent.  # noqa: E501
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this AllocationTransactionResponseContent.

        Security price at which the shares were purchased as part of the transaction  # noqa: E501

        :param price: The price of this AllocationTransactionResponseContent.  # noqa: E501
        :type: float
        """

        self._price = price

    @property
    def _date(self):
        """Gets the _date of this AllocationTransactionResponseContent.  # noqa: E501

        Date of the allocation transaction  # noqa: E501

        :return: The _date of this AllocationTransactionResponseContent.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this AllocationTransactionResponseContent.

        Date of the allocation transaction  # noqa: E501

        :param _date: The _date of this AllocationTransactionResponseContent.  # noqa: E501
        :type: date
        """

        self.__date = _date

    @property
    def model_id(self):
        """Gets the model_id of this AllocationTransactionResponseContent.  # noqa: E501

        Date of the allocation transaction  # noqa: E501

        :return: The model_id of this AllocationTransactionResponseContent.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this AllocationTransactionResponseContent.

        Date of the allocation transaction  # noqa: E501

        :param model_id: The model_id of this AllocationTransactionResponseContent.  # noqa: E501
        :type: str
        """

        self._model_id = model_id

    @property
    def security_id(self):
        """Gets the security_id of this AllocationTransactionResponseContent.  # noqa: E501

        The ID of the security included in the allocation transaction  # noqa: E501

        :return: The security_id of this AllocationTransactionResponseContent.  # noqa: E501
        :rtype: str
        """
        return self._security_id

    @security_id.setter
    def security_id(self, security_id):
        """Sets the security_id of this AllocationTransactionResponseContent.

        The ID of the security included in the allocation transaction  # noqa: E501

        :param security_id: The security_id of this AllocationTransactionResponseContent.  # noqa: E501
        :type: str
        """

        self._security_id = security_id

    @property
    def transaction_code_id(self):
        """Gets the transaction_code_id of this AllocationTransactionResponseContent.  # noqa: E501

        The ID referring to the transaction codes defined by your firm  # noqa: E501

        :return: The transaction_code_id of this AllocationTransactionResponseContent.  # noqa: E501
        :rtype: str
        """
        return self._transaction_code_id

    @transaction_code_id.setter
    def transaction_code_id(self, transaction_code_id):
        """Sets the transaction_code_id of this AllocationTransactionResponseContent.

        The ID referring to the transaction codes defined by your firm  # noqa: E501

        :param transaction_code_id: The transaction_code_id of this AllocationTransactionResponseContent.  # noqa: E501
        :type: str
        """

        self._transaction_code_id = transaction_code_id

    @property
    def secondary_id(self):
        """Gets the secondary_id of this AllocationTransactionResponseContent.  # noqa: E501

        Alternate ID that can be used to identify the object such as an internal id  # noqa: E501

        :return: The secondary_id of this AllocationTransactionResponseContent.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this AllocationTransactionResponseContent.

        Alternate ID that can be used to identify the object such as an internal id  # noqa: E501

        :param secondary_id: The secondary_id of this AllocationTransactionResponseContent.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def create_date(self):
        """Gets the create_date of this AllocationTransactionResponseContent.  # noqa: E501

        Timestamp for the date and time that the record was created  # noqa: E501

        :return: The create_date of this AllocationTransactionResponseContent.  # noqa: E501
        :rtype: date
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this AllocationTransactionResponseContent.

        Timestamp for the date and time that the record was created  # noqa: E501

        :param create_date: The create_date of this AllocationTransactionResponseContent.  # noqa: E501
        :type: date
        """

        self._create_date = create_date

    @property
    def update_date(self):
        """Gets the update_date of this AllocationTransactionResponseContent.  # noqa: E501

        Timestamp for the date and time that the record was last updated  # noqa: E501

        :return: The update_date of this AllocationTransactionResponseContent.  # noqa: E501
        :rtype: str
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this AllocationTransactionResponseContent.

        Timestamp for the date and time that the record was last updated  # noqa: E501

        :param update_date: The update_date of this AllocationTransactionResponseContent.  # noqa: E501
        :type: str
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
        if issubclass(AllocationTransactionResponseContent, dict):
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
        if not isinstance(other, AllocationTransactionResponseContent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
