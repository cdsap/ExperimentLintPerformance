package com.performance.module_4_300

class Feature300UseCase1(
    private val repository: Feature300Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
