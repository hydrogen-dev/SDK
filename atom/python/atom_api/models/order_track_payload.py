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


class OrderTrackPayload(object):
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
        'order_id': 'str',
        'order_status_id': 'str',
        '_date': 'date',
        'commission': 'float',
        'external_track_id': 'str',
        'fee': 'float',
        'price': 'float',
        'quantity': 'float',
        'metadata': 'object'
    }

    attribute_map = {
        'order_id': 'order_id',
        'order_status_id': 'order_status_id',
        '_date': 'date',
        'commission': 'commission',
        'external_track_id': 'external_track_id',
        'fee': 'fee',
        'price': 'price',
        'quantity': 'quantity',
        'metadata': 'metadata'
    }

    def __init__(self, order_id=None, order_status_id=None, _date=None, commission=None, external_track_id=None, fee=None, price=None, quantity=None, metadata=None):  # noqa: E501
        """OrderTrackPayload - a model defined in Swagger"""  # noqa: E501

        self._order_id = None
        self._order_status_id = None
        self.__date = None
        self._commission = None
        self._external_track_id = None
        self._fee = None
        self._price = None
        self._quantity = None
        self._metadata = None
        self.discriminator = None

        self.order_id = order_id
        self.order_status_id = order_status_id
        self._date = _date
        if commission is not None:
            self.commission = commission
        if external_track_id is not None:
            self.external_track_id = external_track_id
        if fee is not None:
            self.fee = fee
        if price is not None:
            self.price = price
        if quantity is not None:
            self.quantity = quantity
        if metadata is not None:
            self.metadata = metadata

    @property
    def order_id(self):
        """Gets the order_id of this OrderTrackPayload.  # noqa: E501

        The ID of the order that the to which order track record belongs  # noqa: E501

        :return: The order_id of this OrderTrackPayload.  # noqa: E501
        :rtype: str
        """
        return self._order_id

    @order_id.setter
    def order_id(self, order_id):
        """Sets the order_id of this OrderTrackPayload.

        The ID of the order that the to which order track record belongs  # noqa: E501

        :param order_id: The order_id of this OrderTrackPayload.  # noqa: E501
        :type: str
        """
        if order_id is None:
            raise ValueError("Invalid value for `order_id`, must not be `None`")  # noqa: E501

        self._order_id = order_id

    @property
    def order_status_id(self):
        """Gets the order_status_id of this OrderTrackPayload.  # noqa: E501

        The ID of the order status currently assigned to the order track record  # noqa: E501

        :return: The order_status_id of this OrderTrackPayload.  # noqa: E501
        :rtype: str
        """
        return self._order_status_id

    @order_status_id.setter
    def order_status_id(self, order_status_id):
        """Sets the order_status_id of this OrderTrackPayload.

        The ID of the order status currently assigned to the order track record  # noqa: E501

        :param order_status_id: The order_status_id of this OrderTrackPayload.  # noqa: E501
        :type: str
        """
        if order_status_id is None:
            raise ValueError("Invalid value for `order_status_id`, must not be `None`")  # noqa: E501

        self._order_status_id = order_status_id

    @property
    def _date(self):
        """Gets the _date of this OrderTrackPayload.  # noqa: E501

        Date of the order track record  # noqa: E501

        :return: The _date of this OrderTrackPayload.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this OrderTrackPayload.

        Date of the order track record  # noqa: E501

        :param _date: The _date of this OrderTrackPayload.  # noqa: E501
        :type: date
        """
        if _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def commission(self):
        """Gets the commission of this OrderTrackPayload.  # noqa: E501

        Commission earned by the agent on the order  # noqa: E501

        :return: The commission of this OrderTrackPayload.  # noqa: E501
        :rtype: float
        """
        return self._commission

    @commission.setter
    def commission(self, commission):
        """Sets the commission of this OrderTrackPayload.

        Commission earned by the agent on the order  # noqa: E501

        :param commission: The commission of this OrderTrackPayload.  # noqa: E501
        :type: float
        """

        self._commission = commission

    @property
    def external_track_id(self):
        """Gets the external_track_id of this OrderTrackPayload.  # noqa: E501

        The external ID used by the agent or other party executing the order to track the order ticket (if provided)  # noqa: E501

        :return: The external_track_id of this OrderTrackPayload.  # noqa: E501
        :rtype: str
        """
        return self._external_track_id

    @external_track_id.setter
    def external_track_id(self, external_track_id):
        """Sets the external_track_id of this OrderTrackPayload.

        The external ID used by the agent or other party executing the order to track the order ticket (if provided)  # noqa: E501

        :param external_track_id: The external_track_id of this OrderTrackPayload.  # noqa: E501
        :type: str
        """

        self._external_track_id = external_track_id

    @property
    def fee(self):
        """Gets the fee of this OrderTrackPayload.  # noqa: E501

        Total fees associated with the order  # noqa: E501

        :return: The fee of this OrderTrackPayload.  # noqa: E501
        :rtype: float
        """
        return self._fee

    @fee.setter
    def fee(self, fee):
        """Sets the fee of this OrderTrackPayload.

        Total fees associated with the order  # noqa: E501

        :param fee: The fee of this OrderTrackPayload.  # noqa: E501
        :type: float
        """

        self._fee = fee

    @property
    def price(self):
        """Gets the price of this OrderTrackPayload.  # noqa: E501

        Execution price at which the securities in the order were bought or sold  # noqa: E501

        :return: The price of this OrderTrackPayload.  # noqa: E501
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this OrderTrackPayload.

        Execution price at which the securities in the order were bought or sold  # noqa: E501

        :param price: The price of this OrderTrackPayload.  # noqa: E501
        :type: float
        """

        self._price = price

    @property
    def quantity(self):
        """Gets the quantity of this OrderTrackPayload.  # noqa: E501

        Quantity of securities that were bought or sold  # noqa: E501

        :return: The quantity of this OrderTrackPayload.  # noqa: E501
        :rtype: float
        """
        return self._quantity

    @quantity.setter
    def quantity(self, quantity):
        """Sets the quantity of this OrderTrackPayload.

        Quantity of securities that were bought or sold  # noqa: E501

        :param quantity: The quantity of this OrderTrackPayload.  # noqa: E501
        :type: float
        """

        self._quantity = quantity

    @property
    def metadata(self):
        """Gets the metadata of this OrderTrackPayload.  # noqa: E501

        Custom information associated with the order tracking record in the format key:value  # noqa: E501

        :return: The metadata of this OrderTrackPayload.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this OrderTrackPayload.

        Custom information associated with the order tracking record in the format key:value  # noqa: E501

        :param metadata: The metadata of this OrderTrackPayload.  # noqa: E501
        :type: object
        """

        self._metadata = metadata

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
        if issubclass(OrderTrackPayload, dict):
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
        if not isinstance(other, OrderTrackPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
