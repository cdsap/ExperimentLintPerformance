package com.performance.module_4_300

class Feature300UseCase0(
    private val repository: Feature300Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
