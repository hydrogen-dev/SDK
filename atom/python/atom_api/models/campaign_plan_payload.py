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

from atom_api.models.campaign_plan_payload_plan_rates import CampaignPlanPayloadPlanRates  # noqa: F401,E501
from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class CampaignPlanPayload(object):
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
        'description': 'str',
        'is_active': 'bool',
        'plan_rates': 'list[CampaignPlanPayloadPlanRates]',
        'secondary_id': 'SecondaryId',
        'metadata': 'object'
    }

    attribute_map = {
        'description': 'description',
        'is_active': 'is_active',
        'plan_rates': 'plan_rates',
        'secondary_id': 'secondary_id',
        'metadata': 'metadata'
    }

    def __init__(self, description=None, is_active=True, plan_rates=None, secondary_id=None, metadata=None):  # noqa: E501
        """CampaignPlanPayload - a model defined in Swagger"""  # noqa: E501

        self._description = None
        self._is_active = None
        self._plan_rates = None
        self._secondary_id = None
        self._metadata = None
        self.discriminator = None

        self.description = description
        if is_active is not None:
            self.is_active = is_active
        if plan_rates is not None:
            self.plan_rates = plan_rates
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if metadata is not None:
            self.metadata = metadata

    @property
    def description(self):
        """Gets the description of this CampaignPlanPayload.  # noqa: E501

        Description for the campaign plan  # noqa: E501

        :return: The description of this CampaignPlanPayload.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this CampaignPlanPayload.

        Description for the campaign plan  # noqa: E501

        :param description: The description of this CampaignPlanPayload.  # noqa: E501
        :type: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def is_active(self):
        """Gets the is_active of this CampaignPlanPayload.  # noqa: E501

        Indicates if the campaign plan is currently active. Defaults to true which indicates that it is active  # noqa: E501

        :return: The is_active of this CampaignPlanPayload.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this CampaignPlanPayload.

        Indicates if the campaign plan is currently active. Defaults to true which indicates that it is active  # noqa: E501

        :param is_active: The is_active of this CampaignPlanPayload.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def plan_rates(self):
        """Gets the plan_rates of this CampaignPlanPayload.  # noqa: E501


        :return: The plan_rates of this CampaignPlanPayload.  # noqa: E501
        :rtype: list[CampaignPlanPayloadPlanRates]
        """
        return self._plan_rates

    @plan_rates.setter
    def plan_rates(self, plan_rates):
        """Sets the plan_rates of this CampaignPlanPayload.


        :param plan_rates: The plan_rates of this CampaignPlanPayload.  # noqa: E501
        :type: list[CampaignPlanPayloadPlanRates]
        """

        self._plan_rates = plan_rates

    @property
    def secondary_id(self):
        """Gets the secondary_id of this CampaignPlanPayload.  # noqa: E501


        :return: The secondary_id of this CampaignPlanPayload.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this CampaignPlanPayload.


        :param secondary_id: The secondary_id of this CampaignPlanPayload.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def metadata(self):
        """Gets the metadata of this CampaignPlanPayload.  # noqa: E501

        Custom information associated with the campaign plan in the format key:value  # noqa: E501

        :return: The metadata of this CampaignPlanPayload.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this CampaignPlanPayload.

        Custom information associated with the campaign plan in the format key:value  # noqa: E501

        :param metadata: The metadata of this CampaignPlanPayload.  # noqa: E501
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
        if issubclass(CampaignPlanPayload, dict):
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
        if not isinstance(other, CampaignPlanPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
