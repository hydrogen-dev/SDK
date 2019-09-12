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

from atom_api.models.financial_picture_response_snapshot_by_category import FinancialPictureResponseSnapshotByCategory  # noqa: F401,E501
from atom_api.models.financial_picture_response_snapshot_net_worth import FinancialPictureResponseSnapshotNetWorth  # noqa: F401,E501
from atom_api.models.financial_picture_response_snapshot_total_assets import FinancialPictureResponseSnapshotTotalAssets  # noqa: F401,E501
from atom_api.models.financial_picture_response_snapshot_total_liabilities import FinancialPictureResponseSnapshotTotalLiabilities  # noqa: F401,E501


class FinancialPictureResponseSnapshot(object):
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
        'total_assets': 'FinancialPictureResponseSnapshotTotalAssets',
        'total_liabilities': 'FinancialPictureResponseSnapshotTotalLiabilities',
        'net_worth': 'FinancialPictureResponseSnapshotNetWorth',
        'by_category': 'list[FinancialPictureResponseSnapshotByCategory]'
    }

    attribute_map = {
        'total_assets': 'total_assets',
        'total_liabilities': 'total_liabilities',
        'net_worth': 'net_worth',
        'by_category': 'by_category'
    }

    def __init__(self, total_assets=None, total_liabilities=None, net_worth=None, by_category=None):  # noqa: E501
        """FinancialPictureResponseSnapshot - a model defined in Swagger"""  # noqa: E501

        self._total_assets = None
        self._total_liabilities = None
        self._net_worth = None
        self._by_category = None
        self.discriminator = None

        if total_assets is not None:
            self.total_assets = total_assets
        if total_liabilities is not None:
            self.total_liabilities = total_liabilities
        if net_worth is not None:
            self.net_worth = net_worth
        if by_category is not None:
            self.by_category = by_category

    @property
    def total_assets(self):
        """Gets the total_assets of this FinancialPictureResponseSnapshot.  # noqa: E501


        :return: The total_assets of this FinancialPictureResponseSnapshot.  # noqa: E501
        :rtype: FinancialPictureResponseSnapshotTotalAssets
        """
        return self._total_assets

    @total_assets.setter
    def total_assets(self, total_assets):
        """Sets the total_assets of this FinancialPictureResponseSnapshot.


        :param total_assets: The total_assets of this FinancialPictureResponseSnapshot.  # noqa: E501
        :type: FinancialPictureResponseSnapshotTotalAssets
        """

        self._total_assets = total_assets

    @property
    def total_liabilities(self):
        """Gets the total_liabilities of this FinancialPictureResponseSnapshot.  # noqa: E501


        :return: The total_liabilities of this FinancialPictureResponseSnapshot.  # noqa: E501
        :rtype: FinancialPictureResponseSnapshotTotalLiabilities
        """
        return self._total_liabilities

    @total_liabilities.setter
    def total_liabilities(self, total_liabilities):
        """Sets the total_liabilities of this FinancialPictureResponseSnapshot.


        :param total_liabilities: The total_liabilities of this FinancialPictureResponseSnapshot.  # noqa: E501
        :type: FinancialPictureResponseSnapshotTotalLiabilities
        """

        self._total_liabilities = total_liabilities

    @property
    def net_worth(self):
        """Gets the net_worth of this FinancialPictureResponseSnapshot.  # noqa: E501


        :return: The net_worth of this FinancialPictureResponseSnapshot.  # noqa: E501
        :rtype: FinancialPictureResponseSnapshotNetWorth
        """
        return self._net_worth

    @net_worth.setter
    def net_worth(self, net_worth):
        """Sets the net_worth of this FinancialPictureResponseSnapshot.


        :param net_worth: The net_worth of this FinancialPictureResponseSnapshot.  # noqa: E501
        :type: FinancialPictureResponseSnapshotNetWorth
        """

        self._net_worth = net_worth

    @property
    def by_category(self):
        """Gets the by_category of this FinancialPictureResponseSnapshot.  # noqa: E501


        :return: The by_category of this FinancialPictureResponseSnapshot.  # noqa: E501
        :rtype: list[FinancialPictureResponseSnapshotByCategory]
        """
        return self._by_category

    @by_category.setter
    def by_category(self, by_category):
        """Sets the by_category of this FinancialPictureResponseSnapshot.


        :param by_category: The by_category of this FinancialPictureResponseSnapshot.  # noqa: E501
        :type: list[FinancialPictureResponseSnapshotByCategory]
        """

        self._by_category = by_category

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
        if issubclass(FinancialPictureResponseSnapshot, dict):
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
        if not isinstance(other, FinancialPictureResponseSnapshot):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
