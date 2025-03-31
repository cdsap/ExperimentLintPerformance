package com.performance.module_2_48

class Feature48UseCase0(
    private val repository: Feature48Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
