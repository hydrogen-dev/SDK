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

from atom_api.models.annuity_return_detail import AnnuityReturnDetail  # noqa: F401,E501


class AnnuityAmountResponse(object):
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
        'annuity_amount': 'float',
        'annuity_frequency_interval': 'str',
        'total_earnings': 'float',
        'total_contributions': 'float',
        'cumulative_annuity_amount': 'float',
        'total_taxes': 'float',
        'return_details': 'dict(str, AnnuityReturnDetail)'
    }

    attribute_map = {
        'annuity_amount': 'annuity_amount',
        'annuity_frequency_interval': 'annuity_frequency_interval',
        'total_earnings': 'total_earnings',
        'total_contributions': 'total_contributions',
        'cumulative_annuity_amount': 'cumulative_annuity_amount',
        'total_taxes': 'total_taxes',
        'return_details': 'return_details'
    }

    def __init__(self, annuity_amount=None, annuity_frequency_interval=None, total_earnings=None, total_contributions=None, cumulative_annuity_amount=None, total_taxes=None, return_details=None):  # noqa: E501
        """AnnuityAmountResponse - a model defined in Swagger"""  # noqa: E501

        self._annuity_amount = None
        self._annuity_frequency_interval = None
        self._total_earnings = None
        self._total_contributions = None
        self._cumulative_annuity_amount = None
        self._total_taxes = None
        self._return_details = None
        self.discriminator = None

        self.annuity_amount = annuity_amount
        self.annuity_frequency_interval = annuity_frequency_interval
        self.total_earnings = total_earnings
        self.total_contributions = total_contributions
        self.cumulative_annuity_amount = cumulative_annuity_amount
        self.total_taxes = total_taxes
        self.return_details = return_details

    @property
    def annuity_amount(self):
        """Gets the annuity_amount of this AnnuityAmountResponse.  # noqa: E501

        The periodic annuity amount.  # noqa: E501

        :return: The annuity_amount of this AnnuityAmountResponse.  # noqa: E501
        :rtype: float
        """
        return self._annuity_amount

    @annuity_amount.setter
    def annuity_amount(self, annuity_amount):
        """Sets the annuity_amount of this AnnuityAmountResponse.

        The periodic annuity amount.  # noqa: E501

        :param annuity_amount: The annuity_amount of this AnnuityAmountResponse.  # noqa: E501
        :type: float
        """
        if annuity_amount is None:
            raise ValueError("Invalid value for `annuity_amount`, must not be `None`")  # noqa: E501
        if annuity_amount is not None and annuity_amount < 0:  # noqa: E501
            raise ValueError("Invalid value for `annuity_amount`, must be a value greater than or equal to `0`")  # noqa: E501

        self._annuity_amount = annuity_amount

    @property
    def annuity_frequency_interval(self):
        """Gets the annuity_frequency_interval of this AnnuityAmountResponse.  # noqa: E501

        The frequency at which annuity_amount is drawn from the portfolio.  # noqa: E501

        :return: The annuity_frequency_interval of this AnnuityAmountResponse.  # noqa: E501
        :rtype: str
        """
        return self._annuity_frequency_interval

    @annuity_frequency_interval.setter
    def annuity_frequency_interval(self, annuity_frequency_interval):
        """Sets the annuity_frequency_interval of this AnnuityAmountResponse.

        The frequency at which annuity_amount is drawn from the portfolio.  # noqa: E501

        :param annuity_frequency_interval: The annuity_frequency_interval of this AnnuityAmountResponse.  # noqa: E501
        :type: str
        """
        if annuity_frequency_interval is None:
            raise ValueError("Invalid value for `annuity_frequency_interval`, must not be `None`")  # noqa: E501

        self._annuity_frequency_interval = annuity_frequency_interval

    @property
    def total_earnings(self):
        """Gets the total_earnings of this AnnuityAmountResponse.  # noqa: E501

        The total earnings generated over the horizon.  # noqa: E501

        :return: The total_earnings of this AnnuityAmountResponse.  # noqa: E501
        :rtype: float
        """
        return self._total_earnings

    @total_earnings.setter
    def total_earnings(self, total_earnings):
        """Sets the total_earnings of this AnnuityAmountResponse.

        The total earnings generated over the horizon.  # noqa: E501

        :param total_earnings: The total_earnings of this AnnuityAmountResponse.  # noqa: E501
        :type: float
        """
        if total_earnings is None:
            raise ValueError("Invalid value for `total_earnings`, must not be `None`")  # noqa: E501

        self._total_earnings = total_earnings

    @property
    def total_contributions(self):
        """Gets the total_contributions of this AnnuityAmountResponse.  # noqa: E501

        The total contributinos added over the horizon.  # noqa: E501

        :return: The total_contributions of this AnnuityAmountResponse.  # noqa: E501
        :rtype: float
        """
        return self._total_contributions

    @total_contributions.setter
    def total_contributions(self, total_contributions):
        """Sets the total_contributions of this AnnuityAmountResponse.

        The total contributinos added over the horizon.  # noqa: E501

        :param total_contributions: The total_contributions of this AnnuityAmountResponse.  # noqa: E501
        :type: float
        """
        if total_contributions is None:
            raise ValueError("Invalid value for `total_contributions`, must not be `None`")  # noqa: E501

        self._total_contributions = total_contributions

    @property
    def cumulative_annuity_amount(self):
        """Gets the cumulative_annuity_amount of this AnnuityAmountResponse.  # noqa: E501

        The total amount received from the annuity over the course of the plan.  # noqa: E501

        :return: The cumulative_annuity_amount of this AnnuityAmountResponse.  # noqa: E501
        :rtype: float
        """
        return self._cumulative_annuity_amount

    @cumulative_annuity_amount.setter
    def cumulative_annuity_amount(self, cumulative_annuity_amount):
        """Sets the cumulative_annuity_amount of this AnnuityAmountResponse.

        The total amount received from the annuity over the course of the plan.  # noqa: E501

        :param cumulative_annuity_amount: The cumulative_annuity_amount of this AnnuityAmountResponse.  # noqa: E501
        :type: float
        """
        if cumulative_annuity_amount is None:
            raise ValueError("Invalid value for `cumulative_annuity_amount`, must not be `None`")  # noqa: E501
        if cumulative_annuity_amount is not None and cumulative_annuity_amount < 0:  # noqa: E501
            raise ValueError("Invalid value for `cumulative_annuity_amount`, must be a value greater than or equal to `0`")  # noqa: E501

        self._cumulative_annuity_amount = cumulative_annuity_amount

    @property
    def total_taxes(self):
        """Gets the total_taxes of this AnnuityAmountResponse.  # noqa: E501

        The total taxes paid on annuity payments over decumulation_horizon.  # noqa: E501

        :return: The total_taxes of this AnnuityAmountResponse.  # noqa: E501
        :rtype: float
        """
        return self._total_taxes

    @total_taxes.setter
    def total_taxes(self, total_taxes):
        """Sets the total_taxes of this AnnuityAmountResponse.

        The total taxes paid on annuity payments over decumulation_horizon.  # noqa: E501

        :param total_taxes: The total_taxes of this AnnuityAmountResponse.  # noqa: E501
        :type: float
        """
        if total_taxes is None:
            raise ValueError("Invalid value for `total_taxes`, must not be `None`")  # noqa: E501

        self._total_taxes = total_taxes

    @property
    def return_details(self):
        """Gets the return_details of this AnnuityAmountResponse.  # noqa: E501


        :return: The return_details of this AnnuityAmountResponse.  # noqa: E501
        :rtype: dict(str, AnnuityReturnDetail)
        """
        return self._return_details

    @return_details.setter
    def return_details(self, return_details):
        """Sets the return_details of this AnnuityAmountResponse.


        :param return_details: The return_details of this AnnuityAmountResponse.  # noqa: E501
        :type: dict(str, AnnuityReturnDetail)
        """
        if return_details is None:
            raise ValueError("Invalid value for `return_details`, must not be `None`")  # noqa: E501

        self._return_details = return_details

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
        if issubclass(AnnuityAmountResponse, dict):
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
        if not isinstance(other, AnnuityAmountResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
